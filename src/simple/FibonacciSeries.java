package simple;

import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        System.out.println("Enter the total count for Fibonacci Series");
        int n1=0,n2=1,n3;
        System.out.println(n1+" "+n2);
        for(int i=2;i<count;i++){
            n3=n1+n2;
            System.out.println(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
