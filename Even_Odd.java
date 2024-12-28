//Write a program to check if a given number is even or odd.
package Basic_Program;
import java.util.Scanner;

public class Even_Odd {
   public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter number  :");
      int num=sc.nextInt();
      if (num%2==0) {
         System.out.println(num+" is Even");
      } else {
         System.out.println(num+" is Odd");
      }
      sc.close();
   }
}
