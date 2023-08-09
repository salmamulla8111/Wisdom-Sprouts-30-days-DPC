package DPC;
import java.util.*;
public class Challenge9 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Actual string: ");
        String word=sc.nextLine();
        String reverseString=reverse(word);
        System.out.println("Reverse string is: "+reverseString);
    }
private static String reverse(String word)
{
    if(word==null||word.trim().isEmpty())
    {
    return word;
    }
    String reverse = "";
    for (int i = word.length ()-1; i>=0; i--) 
    {
        char c= word.charAt(i);
        reverse = reverse+c;
    }
    return reverse;
    }
}
