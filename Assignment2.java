/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;
import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Jacob Liou
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int test[] = {3,6,4,1,3,4,2,5,3,0};
        Assignment2 MontelWilliams = new Assignment2();
        System.out.println(MontelWilliams.Solvable(0, test));
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the size of the array to be sorted: ");
        int arrlen = in.nextInt();
        MontelWilliams.bubbleSort(MontelWilliams.createRandomArray(arrlen));
        MontelWilliams.heapSort(MontelWilliams.createRandomArray(arrlen));
        MontelWilliams.radixSort(MontelWilliams.createRandomArray(arrlen));
    }
    public Assignment2(){}
    
    public boolean Solvable(int start, int[] squares)
    {
        int index = start;
        boolean solved = false;
        boolean loop = false;
        int temp = squares[index];
        int previous = -1;
        if(start == squares.length-1)
            return true;
        while(!solved)
        {
            if(previous == temp && loop)
                return false;
            if(previous == temp)
                loop = true;
            temp = squares[index];
            if(index == squares.length-1) //could also use squares[index] == 0
            {
                solved = true;
            }
            else if(index + temp < squares.length)
            {
                index += temp;
                previous = squares[index];
            }
            else if(index - temp >= 0)
            {
                index -= temp;
                previous = squares[index];
            }
            else break;
        }
        return solved;
    }
    
    public int[] createRandomArray(int n)
    {
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        
    }
    public void bubbleSort(int array[])
    {
        long startTime = System.nanoTime();
        boolean swap;
        int temp;
        System.out.print("Initial array: ");
        viewArray(array);
        do
        {
            swap = false;
            for(int count = 0; count < (array.length-1); count++)
            {
                if (array[count] > array[count + 1])
                {
                temp = array[count];
                array[count] = array[count + 1];
                array[count + 1] = temp;
                swap = true;
                }
    //this loop outputs the array at the end of each traverse
               /* for(int i=0; i<array.length; i++)
                {
                    System.out.print(array[i]+" ");
                }
                System.out.print("\n");
    //this if statement outputs every swap that occurs
                if(swap)
                {
                    System.out.println("Numbers swapped: "+array[count+1]+" with "+array[count]);
                }*/
            }
        } while (swap);
        System.out.print("\nSorted Array: ");
        viewArray(array);
        long stopTime = System.nanoTime();
        System.out.println("\n" + (stopTime - startTime)/1000 + " milliseconds\n");
    }
    
    public static int n;
   
    //Method to swap two values in an array
    public static void swap(int a, int b, int[] array) {
       
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
   
    //The main sorting method
    public static void heapSort(int[] array) {
       
        long startTime = System.nanoTime();
        //Print array  before sorting
        System.out.print("Initial array: ");
        viewArray(array);
       
        //Build the heap using the array
        buildHeap(array);
       
        //Sort the Array
        for(int i = n; i > 0; i--) {
           
            swap(0, i, array);
            n = n - 1;
            maxHeapify(array, 0);
        }
       
        //Print the Sorted array
        System.out.print("\nSorted Array: ");
        viewArray(array);
                
        long stopTime = System.nanoTime();
        System.out.println("\n" + (stopTime - startTime)/1000 + " milliseconds\n");
    }
   
    //Method to view array
    public static void viewArray(int[] array) {
       
        for(int i = 0; i < array.length; i++) {
           
            System.out.print(array[i] + " ");
        }
    }
   
    //Method to build the heap
    public static void buildHeap(int[] array) {
       
        n = array.length - 1;
        for (int i = n / 2; i >= 0; i--) {
            maxHeapify(array, i);
        }
       
    }
   
    //Method for Maximum Heapify
    public static void maxHeapify(int[] array, int leaf) {
       
        int left = 2 * leaf;
        int right = (2 * leaf) + 1;
       
        int minValue = 0; 
       
        if(left <= n && array[left] > array[leaf]) {minValue = left;}
       
        else {minValue = leaf;}
       
        if(right <= n && array[right] > array[minValue]) {minValue = right;}
       
        if(minValue != leaf) {
           
            swap(leaf, minValue, array);
            maxHeapify(array, minValue);
        }
    }

     public void radixSort(int[] input) {
        long startTime = System.nanoTime();
         System.out.print("\nInitialArray: ");
        viewArray(input);
      final int RADIX = 10;
      // declare and initialize bucket[]
      ArrayList<Integer>[] bucket = new ArrayList[RADIX];
      for (int i = 0; i < bucket.length; i++) {
        bucket[i] = new ArrayList<Integer>();
      }

      // sort
      boolean maxLength = false;
      int tmp = -1, placement = 1;
      while (!maxLength) {
        maxLength = true;
        // split input between lists
        for (Integer i : input) {
          tmp = i / placement;
          bucket[tmp % RADIX].add(i);
          if (maxLength && tmp > 0) {
            maxLength = false;
          }
        }
        // empty lists into input array
        int a = 0;
        for (int b = 0; b < RADIX; b++) {
          for (Integer i : bucket[b]) {
            input[a++] = i;
          }
          bucket[b].clear();
        }
        // move to next digit
        placement *= RADIX;
      }
      System.out.print("\nSorted Array: ");
        viewArray(input);
        long stopTime = System.nanoTime();
            System.out.println("\n" + (stopTime - startTime)/1000 + " milliseconds\n");
}
}
