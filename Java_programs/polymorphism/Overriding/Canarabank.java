package Notes.polymorphism.Overriding;
import java.util.*;

public class Canarabank extends Reservebank {

    public void  savingsaccount(int n)
    {

        System.out.println("This is the Savings Account has  "+(n+300) +" RS");
        super.savingsaccount(n);

    }

    public static void main(String[] args) {
        Canarabank c = new Canarabank();
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        c.savingsaccount(value);
    }
    
}
