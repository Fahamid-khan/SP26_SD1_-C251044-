import java.util.*;

public class prob_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];

        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < 5; i++) {
            nums[i] = input.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += nums[i];
        }

        double average = (double)sum / 5;

        System.out.println("Average: " + average);

        input.close();
    }
}