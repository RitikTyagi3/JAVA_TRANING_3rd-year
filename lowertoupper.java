import java.util.Scanner;

public class lowertoupper
{
   public static void main(String[] args)
   {
      char ch;
      int ascii;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a Character in Lowercase: ");
      ch = scan.next().charAt(0);
      
      ascii = ch;
      ascii = ascii - 32;
      ch = (char)ascii;
      
      System.out.println("\nEquivalent Character in Uppercase = " +ch);
   }
}