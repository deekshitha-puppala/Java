//Minimum Removal for ideal String
//Input format: A String S
//Output format: return an integer value representing the no. of removals.
// EXAMPLE --> STR = XYXXYXX, OUTPUT: 2
import java.util.Scanner;
public class _02_RemovalsFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int removals = 0;
        for(int i = 1; i < str.length(); i++) {
            //check if current character is same as previous character
            if(str.charAt(i) == str.charAt(i-1)) {
                removals++;
            }
        }
        System.out.println("No. of characters removed form String: " + removals);
    }
}
