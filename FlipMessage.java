import java.util.*;
public class FlipMessage {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to be flipped: ");
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < str.length();i++) {
            char ch = str.charAt(i);
            char flipped = (char) ('a' + 'z' - ch);
            result.append(flipped);

        }
        System.out.println(result);
    }
}
