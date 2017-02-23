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
    }
    public Assignment2(){}
    public boolean Solvable(int start, int[] squares)
    {
        int index = start;
        boolean solved = false;
        boolean loop = false;
        int temp = squares[index];
        if(start == squares.length-1)
            return true;
        while(!solved)
        {
            int previous = squares[index];
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
            }
            else if(index - temp >= 0)
            {
                index -= temp;
            }
            else break;
        }
        return solved;
    }
    
}
