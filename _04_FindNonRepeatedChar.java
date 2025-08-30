/*Progam to print first-repeated character from given string. */
public class _04_FindNonRepeatedChar {
    public static String findingNonRepeatedCharacter(String str)
    {
        String result = "";
        for(int i = 0; i<str.length(); i++) {
            int count = 0;
            if(str.charAt(i) != ' ')
            {
                for(int j = 0;j<str.length();j++)
                {
                if(str.charAt(i) == str.charAt(j) && i != j)
                {
                    count++;
                    break;
                }
                }
            if(count == 0)
            {
                result += str.charAt(i);
                break;
            }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = "Software Services";
        System.out.println("ans is: " + findingNonRepeatedCharacter(str));
    }
}

