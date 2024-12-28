package Basic_Program;
import java.util.Scanner;
//Write a program to find the factorial of a given number.
public class Factorial {
   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter number for Factorial :");
      int num=sc.nextInt();
      int Factorial=1;
      for (int i = 1; i <=num; i++) {
         Factorial*=i;
      }
      System.out.println("Factorial of "+num+" is "+Factorial);
   sc.close();
   }
}
