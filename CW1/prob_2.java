import java.util.*;

public class prob_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++) {
            nums[i] = input.nextInt();
        }

        int max = nums[0];

        for (int i = 1; i < 5; i++) {
            if (nums[i] > max)
                max = nums[i];
        }

        System.out.println("Largest number: " + max);

        input.close();
    }
}