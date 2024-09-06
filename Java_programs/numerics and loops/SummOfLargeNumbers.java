import java.util.*;
public class SummOfLargeNumbers {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        long number=sc.nextLong();
        long rem,sum=0;
        
        
        if(number<999999)
        {
            System.out.println("Enter a the numberss with Digit with 7 or greater than 7");
        }

        else{
            while(number>0)
            {
    
    
                rem=number%10;
                if(rem%2!=0)
                {
                    sum+=rem;
                }
    
    
    
            }
        }

        System.out.println(sum);
        
    }

    
}
