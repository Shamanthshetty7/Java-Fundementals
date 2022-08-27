/*Terms of AP
Send Feedback
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
Input format :
Integer x
Output format :
Terms of series (separated by space)
Constraints :
1 <= x <= 1,000
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int ans=0;
        int n=1;
        for(int c=1;c<=x;){
            ans=3*n+2;
            if(ans%4!=0){
                System.out.print(ans+" ");
                c=c+1;
                n=n+1;
            }
            else{
                n=n+1;
            }
        }

	}