/*Fibonacci Number

Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
Fibonacci Series is defined by the recurrence
    F(n) = F(n-1) + F(n-2)
where F(0) = 0 and F(1) = 1


Input Format :
Integer N
Output Format :
true or false

Sample Input 1 :
5
Sample Output 1 :
true*/
import java.util.Scanner;
public class Solution {

    public static boolean checkMember(int n){
        if(n==0){
            return true;
        }
        int cur_fib=0;
        int up_fib=1;
        int add_fib=0;
        for(int i=0;i<=n;i++){
            add_fib=cur_fib+up_fib;
            cur_fib=up_fib;
            up_fib=add_fib;
            if(add_fib==n){
                return true;
            }


        }
        return false;


    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        boolean fib=checkMember(n);
        System.out.println(fib);

    }


}
