import java.util.*;
public class Arr {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<=j){
            if(i!=j)
            System.out.print(arr[j--]+" "+arr[i++]+" ");
            else
            System.out.print(arr[i++]);
        }
    }
    
}
