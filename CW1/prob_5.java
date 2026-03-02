import java.util.*;

public class prob_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");

        int n = input.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        
        int even = 0;
        int odd = 0;
        
        for(int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) 
                even++;
            else 
                odd++;
        }
        
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        
        input.close();
    }
}