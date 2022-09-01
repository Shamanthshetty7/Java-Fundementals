/*Decimal to Binary

Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note: The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.


Note for C++ coders: Do not use the inbuilt implementation of "pow" function. The implementation of that function is done for 'double's and it may fail when used for 'int's, 'long's, or 'long long's. Implement your own "pow" function to work for non-float data types.


Input format :
Integer N
Output format :
Corresponding Binary number (long)

Sample Input 1 :
12
Sample Output 1 :
1100
*/
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
