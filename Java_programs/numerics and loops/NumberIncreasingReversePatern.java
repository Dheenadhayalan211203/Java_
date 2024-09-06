
import java.util.*;
public class NumberIncreasingReversePatern {

    public static void main(String[]args)
    {
         
        int n=5;

        for(int row=0;row<=n;row++)
        {
            for(int col=1;col<=n-row;col++)
            {
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }
    
}
