package Basic_Program;
import java.util.Scanner;

public class Leap_Year {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Year  :");
      int Year = sc.nextInt();

      // if (Year % 100 == 0) {
      //    if (Year % 400==0) {
      //       System.out.println("Leap Year");
      //    }
      //    else{
      //       System.out.println("Not a Leap year");
      //    }
      // } else if (Year % 4 == 0) {
      //    System.out.println("Leap Year");
      // }
      // else{
      //    System.out.println("Not a Leap year");
      // }

      if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) {
         System.out.println(Year + " is a Leap Year.");
     } else {
         System.out.println(Year + " is Not a Leap Year.");
     }

      sc.close();

   }
}
