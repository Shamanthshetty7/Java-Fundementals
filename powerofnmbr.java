// Find power of a number

// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
//Note : For this question, you can assume that 0 raised to the power of 0 is 1


//Input format :
//Two integers x and n (separated by space)

//Output Format :
//x^n (i.e. x raise to the power n)

import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int i=1;
        int pow=1;
        while(i<=n){
           pow=pow*x ;
            i=i+1;
            }
        System.out.println(pow);

    }
}