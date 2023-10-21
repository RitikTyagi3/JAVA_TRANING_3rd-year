import java.util.Scanner;

public class uppertolower{
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string in uppercase: ");
        String uppercaseString = input.nextLine();
        String lowercaseString = uppercaseString.toLowerCase();
        System.out.println("Lowercase string: " + lowercaseString);

        input.close();
    }
}