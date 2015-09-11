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
public class a7q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("How many people's height are being recorded?");
        int size = input.nextInt();
        int nums[] = new int[size];
        for(int i =0 ; i <nums.length; i++)
        {
            System.out.println("Enter the different heights:");
            int height = input.nextInt();
            nums[i] = height;
        }
        int total = 0;
        for(int i =0; i <nums.length; i++)
        {
            total +=  nums[i];
        } 
        int average = total/size;
        System.out.println("The average height is " + average);
        
        System.out.println("The heights above average are: ");
        for(int i = 0; i <nums.length; i++)
        {
            if( average < nums[i])
            {
                System.out.println(nums[i]);
            }
        }
    }
}
