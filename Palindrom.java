package Basic_Program;
import java.util.Scanner;

public class Palindrom {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number  :");
      int num = sc.nextInt();
      int temp=num;
      int reverse = 0;

      while (temp != 0) {
         int digit = temp % 10;
         reverse = reverse * 10 + digit;
         temp /= 10;
      }
      if (num==reverse) {
         System.out.println(num+" is palindrom");
         
      }
      else{
         System.out.println(num+" is not a palindrom");


      }
      sc.close();
   }
}
