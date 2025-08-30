import java.util.Scanner;
public class _03_ReverseStr {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        System.out.println("String before reverse: " + str);
        System.out.print("String after reverse: ");
        for(int i = str.length() - 1; i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }
        sc.close();
        
    }
    
}
