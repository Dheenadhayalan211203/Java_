import java.util.*;
public class Patern2 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <=n; col++) {
                if (col == n||row==1||row==n||col==1)

                {
                    System.out.print(" * ");
                }

                 else
                 {
                    System.out.print("  ");
                 }
            }
            System.out.println();
        }
    }
}