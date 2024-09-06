package TCS;
import java.util.*;

public class Wheel {


    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int w = sc.nextInt();
       
        if(w%2==0)
        {
            System.out.println("Two wheeler  : "+ ( ( ( v * 4 ) - w ) / 2 ) +"\n" +"four wheeler : "+( v - ( ( ( v * 4 ) - w ) / 2 ) ));
        }

        else{
            System.out.println("Canot determine");
        }
    }

    
}
