import java.util.*;

public class prob_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++) {
            nums[i] = input.nextInt();
        }

        int min = nums[0];

        for (int i = 1; i < 5; i++) {
            if (nums[i] < min)
                min = nums[i];
        }

        System.out.println("Smallest number: " + min);

        input.close();
    }
}