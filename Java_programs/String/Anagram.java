package String;
import java.util.*;

public class Anagram {

    public static void main(String[]args)
    {

        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char [] chararr1=(s1.toCharArray());
        char [] chararr2=s2.toCharArray();
        Arrays.sort(chararr1);
        Arrays.sort(chararr2);
         if(Arrays.equals(chararr1,chararr2))
         {
            System.out.println("Anagram");
         }

         else{

            System.out.println("Not an anagram");
            
         }
    }
    
}
