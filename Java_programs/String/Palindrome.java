package String;

  
import java.util.*;
 

public class Palindrome {

    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String strrev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            strrev=strrev+str.charAt(i);
        }
        if(str.equals(strrev))
        {
            System.out.println("A palindrome");

        }
        else
        {
            System.out.println("Not a palindrome");
        }

    }
    
}

