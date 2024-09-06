import java.util.*;
public class Ambicable {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num1sum=0,num2sum=0;

        for(int i=1;i<=num1/2;i++)
        {
               if(num1%i==0){num1sum+=i;}
        }
        for(int i=1;i<=num2/2;i++)
        {
               if(num2%i==0){num2sum+=i;}
        }
        if(num1==num2sum&&num2==num1sum){System.out.println("It is a Ambicable number");}else{System.out.println("It is not a ambicable number");}
    }
    
}
