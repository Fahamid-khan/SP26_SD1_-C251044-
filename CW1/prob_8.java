import java.util.Scanner;

public class prob_8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        String original = input.nextLine();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        if (original.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        input.close();
    }
}