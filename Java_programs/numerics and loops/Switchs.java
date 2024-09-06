import java.util.*;

public class Switchs
{

    public static void main()
    {

        String vowel="aeiou";
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);

        for(int i=0;i<6;i++)
        {
               if(ch==vowel.charAt(i))
               {
                System.out.println("Vowel");
               }

               else{

                System.out.println("Consonant");
               }
        }

    }

}