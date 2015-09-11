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
public class a7q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner input = new Scanner (System.in);
        System.out.println("How many students are in the class");
        int size = input.nextInt();
        
        int nums[] = new int[size];
        for(int i =0 ; i <nums.length; i++)
        {
            System.out.println("Enter the marks:");
            int grade = input.nextInt();
            nums[i] = grade;
        }
        int total = 0;
        for(int i =0; i <nums.length; i++)
        {
            total +=  nums[i];
        } 
        int average = total/size;
        System.out.println("The class average is " + average);
            
        
    }
}
