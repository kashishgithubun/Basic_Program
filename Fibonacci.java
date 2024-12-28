package Basic_Program;
public class Fibonacci {
   public static void main(String[] args) {
      int a=-1,b=1,c;
      int count=1;
      while (count<11) {
         c=a+b;
         System.out.print(c);
         if (count < 10) { 
         System.out.print(", ");
     }
         a=b;
         b=c;
         count++;
      }
   }
}
