//Write a program to check if a given string is a palindrome
package Basic_Program;
import java.util.Scanner;

public class Reverse_Number {
   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.print("Enter number  :");
      int num=sc.nextInt();
      int reverse = 0;

        while (num != 0) {
            int digit = num % 10;  // Extract the last digit
            reverse = reverse * 10 + digit;  // Add it to the reversed number
            num /= 10;  // Remove the last digit
        }

        System.out.println("Reversed number: " + reverse);
        sc.close();
   }
}
