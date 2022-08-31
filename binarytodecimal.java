/*Binary to decimal


Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format

Output format :
Corresponding Decimal number (as integer)


Sample Input 1 :
1100
Sample Output 1 :
12*/

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
        long  n=s.nextInt();
        long  rem=0;
        long  p=1;
        long  ans=0;
        while(n>0){
            rem=n%2;
            ans=ans+rem*p;
            n=n/2;
            p=p*10;
        }
        System.out.print(ans);

	}
}
