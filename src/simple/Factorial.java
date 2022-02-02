package simple;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.println("Enter the number to calculate Factorial: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
