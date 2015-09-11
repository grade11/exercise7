
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muirw5809
 */
public class a7q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("How many people's marks are being recorded?");
        int size = input.nextInt();
        int nums[] = new int[size];
        
        for(int i =0 ; i <nums.length; i++)
        {
            System.out.println("please enter a mark:");
            int number = input.nextInt();
            nums[i] = number;
        }
        System.out.println("The marks in order from lowest to greatest are: ");
        for(int i =0 ; i <nums.length - 1; i++)
        {
            for(int j = i + 1 ; j <nums.length ; j++)
        {
          if(nums[i] > nums[j])
          {
              int z = 0;
              z = nums[j];
              nums[j] = nums[i];
              nums[i] = z;   
          }
        }   
        }
         for(int i =0 ; i <nums.length; i++)
         {     
        System.out.println(nums[i]);
         }
         int median1;
         double median;
         if(nums.length % 2 == 0)
         {
             double a = nums.length/2;
             double b = (nums.length/2) + 1;
             median = ((a + b)/2);
             System.out.println("The median of the marks is: " + median);
         }else
         {
             median1 = nums[nums.length/2];
             System.out.println("The median of the marks is: " + median1);
         }
         
         
         
         
    }
}
