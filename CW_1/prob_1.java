import java.util.*;

public class prob_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++) {
            nums[i] = input.nextInt();
        }

        System.out.println("The numbers are:");

        for(int i = 0; i < 5; i++) {
            System.out.println(nums[i]);
        }

        input.close();
    }
}
