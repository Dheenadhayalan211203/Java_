import java.util.*;

public class NumberChangingPyramid {

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int start=1;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=row;col++)
            {
                System.out.print(start++ + " ");
            }

            System.out.println();
             
        }
    }
    
}
