/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2;

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
        MontelWilliams.bubbleSort(test);
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
    
    public void bubbleSort(int array[])
{
    System.out.println("Bubble Sort: \n");
    boolean swap;
    int temp;
    System.out.println("Initial array: ");
    for(int i=0; i<array.length; i++)
            {
                System.out.print(array[i]+" ");
            }
    System.out.println("\n");
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
            for(int i=0; i<array.length; i++)
            {
                System.out.print(array[i]+" ");
            }
            System.out.print("\n");
//this if statement outputs every swap that occurs
            if(swap)
            {
                System.out.println("Numbers swapped: "+array[count+1]+" with "+array[count]);
            }
        }
    } while (swap);
    System.out.println("Sorted!"+"\n");
}
    
}
