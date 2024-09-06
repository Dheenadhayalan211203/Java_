package TCS;
import java.util.*;

public class Para {

    public static void main(String[] args) throws java.lang.Exception {
        String str=new String(" Vanakam da mapla" );
        char[] ch=new char[str.length()];
         
        int space=0,caps=0,small=0;
        ch =str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
             if(ch[i]==' ')
             {
                 space++;
             }
             if(ch[i]>='A' && ch[i]<='Z')
             {

                caps++;

             }

             if(ch[i]>='a'&&ch[i]<='z')
             {
                small++;
             }
        }

        System.out.println("Spaces : "+space);
        System.out.println("Caps : "+caps);
        System.out.println("Small : "+small);
        System.out.println(str);
        
         
        
    }


    
}
