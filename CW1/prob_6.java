import java.util.*;

public class prob_6 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");

        int n = input.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }

        System.out.print("Element: ");
        int x = input.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (nums[i] == x) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element found");
        else
            System.out.println("Element not found");

        input.close();
    }
}