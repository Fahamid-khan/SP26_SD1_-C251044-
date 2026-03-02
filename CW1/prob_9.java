import java.util.*;

public class prob_9 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        str = str.toLowerCase();

        int vowel = 0;
        int cons = 0;

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                vowel++;
            else 
                cons++;
        }
        
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + cons);

        input.close();
    }
}