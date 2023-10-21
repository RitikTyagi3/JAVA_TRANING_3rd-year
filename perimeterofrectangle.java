
import java.util.Scanner;
public class perimeterofrectangle {
   public static void main(String args[]){
      int length, breadth, perimeter;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length of the rectangle ::");
      length = sc.nextInt();
      System.out.println("Enter the breadth of the rectangle ::");
      breadth = sc.nextInt();
      perimeter= 2*(length+breadth);
      System.out.println("perimeter of the rectangle is ::"+perimeter);
   }
}