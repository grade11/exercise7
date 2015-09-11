package excercise.pkg7;


import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class a7q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
       //create 10 arrays
        int nums[] = new int[10];
        int z = 0;
        for(int i =0 ; i <nums.length; i++)
        {
            System.out.println("please enter a mark:");
            int number = input.nextInt();
            nums[i] = number;
        }
        for(int i =0 ; i <nums.length - 1; i++)
        {
            for(int j = i + 1 ; j <nums.length ; j++)
        {
          if(nums[i] > nums[j])
          {
              z = nums[j];
              nums[j] = nums[i];
              nums[i] = z;   
          }
        }   
        }
        System.out.println("The marks in order from lowest to greatest are: ");
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(nums[5]);
        System.out.println(nums[6]);
        System.out.println(nums[7]);
        System.out.println(nums[8]);
        System.out.println(nums[9]);
  
    }
}
