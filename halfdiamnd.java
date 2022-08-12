// Half Diamond Pattern

// Write a program to print N number of rows for Half Diamond pattern using stars and numbers
// Note : There are no spaces between the characters in a single line.

// Sample Input 1 :
// 3
// Sample Output 1 :
// *
// *1*
// *121*
// *12321*
// *121*
// *1*
// *


import java.util.Scanner;
public class Solution {


    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1=n;
        for(int i=1;i<=n+1;i++) {
            
            for(int j=1;j<=i;j++) {
                if (j==1){
                    System.out.print("*");
                }
                else
                {
                System.out.print(j-1);
                }
            }
            for(int j=i-1;j>=1;j--) {
                 if (j==1 ){
                    System.out.print("*");
                }
                else
                {
                System.out.print(j-1);
                }
            }
            System.out.println();
            
        }
        for(int i=n1;i>=0;i--) {
            if(n1==0)
            {
                System.out.print("*");

            }
            for(int j=0;j<i;j++) {
                if (j==0){
                    System.out.print("*");
                }
                else
                {
                System.out.print(j);
                }
            }
            for(int j=i-1;j>=1;j--) {
                 if (j==1 ){
                    System.out.print("*");
                }
                else
                {
                System.out.print(j-1);
                }
            }
            System.out.println();
            
        }
    }
}