/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise.pkg7;

import java.util.Scanner;

/**
 *
 * @author muirw5809
 */
public class a7q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        //create two arrays
        int nums[] = new int[2];
        //enter two numbers
        for(int i =0 ; i <nums.length; i++)
        {
            System.out.println("please enter a number:");
            int number = input.nextInt();
            nums[i] = number;
        }
        
        int first = nums[0];
        int second = nums[1];
        for(int i = 0; i <nums.length; i++)
        {
            // if the second integer is smaller than the first integer
            if(second < first)
            {
                //first and second integer will switch places
             second = nums[0];
             first = nums[1];
             
            }
        }
        System.out.println("the integers in ascending order are " + first + " " + second);
    }
}
