import java.util.*;
public class Reversedigit {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String nstr=Integer.toString(n);
        String nstrrev="";


        for(int i=nstr.length() ;i>0;i--)
        {
             nstrrev=nstrrev+nstr.charAt(i-1);
        }

        System.out.println(Integer.parseInt(nstrrev));
        

    }
    
}
