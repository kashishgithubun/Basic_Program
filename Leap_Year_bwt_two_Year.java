package Basic_Program;

import java.util.Scanner;

public class Leap_Year_bwt_two_Year {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter Starting Year :");
      int startyear = sc.nextInt();
      System.out.print("Enter Ending Year :");
      int endyear = sc.nextInt();
      System.out.println("Leap year between " + startyear + " and " + endyear);
      for (int year = startyear; year <= endyear; year++) {
         if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " ");
         }
      }
      sc.close();
   }
}
