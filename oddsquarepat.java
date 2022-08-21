// Odd Square

// Write a program to print the pattern for the given N number of rows.
// For N = 4
// 1357
// 3571
// 5713
// 7135

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n) {
            int j=n;
            int odd= 2*i-1;
            while(j>=i){
                System.out.print(odd);
                odd=odd+2;
                j=j-1;
            }
            int p=1;
            int d=1;
            while (d<=i-1) {
                System.out.print(p);
                p=p+2;
                d=d+1;
            }

            System.out.println();
            i=i+1;

        }

    }

}