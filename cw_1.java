import java.util.*;

public class cw_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The numbers are:");

        for(int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        input.close();
    }
}
