
import java.io.IOException;
import java.util.*;
public class Exception {

    public static void main(String[]args)
    {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        try{
            System.out.println(n*n);
        }

        catch(InputMismatchException e)
        {
            System.out.print(e);
        }
    }
    
}
