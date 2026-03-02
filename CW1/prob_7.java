import java.util.*;

public class prob_7 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");

        int n = input.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }

        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }

        input.close();
    }
}