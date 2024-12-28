package Basic_Program;
import java.util.Scanner;

public class Largest_Amonge_three {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter First Number : ");
      int first=sc.nextInt();
      System.out.print("Enter Second Number : ");
      int Second=sc.nextInt();
      System.out.print("Enter Third Number : ");
      int Third=sc.nextInt();
      if (Second>first&&Second>Third) {
         System.out.println("Largest Element is :"+Second);

      } 
      else if (Third>first&&Third>Second) {
         System.out.println("Largest Element is :"+Third);
      }
      else {
         System.out.println("Largest Element is :"+first);
      }
sc.close();

   }
}
