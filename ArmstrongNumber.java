package Basic_Program;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int originalNum = num;
        
        // Find the number of digits in the number
        int numberOfDigits = String.valueOf(num).length();
         // Count the number of digits
         
        //  int digits = 0;
        //  int temp = num;
        //  while (temp != 0) {
        //      temp /= 10;
        //      digits++;
        //  }
        
        int sum = 0;
        
       
        while (num > 0) {
            int digit = num % 10;  // Get the last digit
            sum += Math.pow(digit, numberOfDigits);  // Add the power of the digit to the sum
            num /= 10;  // Remove the last digit
        }
        
        // Check if the sum is equal to the original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
        
        sc.close();
    }
}

