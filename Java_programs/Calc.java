package TCS;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        double temp;
        double root = num / 2.0;
        do {
            temp = root;
            root = (temp + (num / temp)) / 2.0;
        } while ((temp - root) != 0);

        System.out.println(root);
    }
    
}
