package Basic_Program;
import java.util.Scanner;
//Write a program to check if a given number is prime or not
public class Prime_Number {
 
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
      System.out.println("Enter number  :");
      int num=sc.nextInt();
      if (num <= 1) {
         System.out.println(num + " is not a prime number.");
         sc.close();
         return;
     }
      boolean isPrime = true;
      for (int i = 2; i <Math.sqrt(num); i++) {
         if (num%i==0) {
            isPrime = false;
            break;
         }
      }
      if (isPrime) {
         System.out.println(num+" is  a prime number");
      }
      else{
         System.out.println(num+" is not a prime number");
      }
      sc.close();
   }
}
