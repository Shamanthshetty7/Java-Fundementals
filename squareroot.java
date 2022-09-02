/*Square Root (Integral)

Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.
Input format :
Integer N

Output Format :
Square root of N (integer part only)

Sample Input 1 :
10
Sample Output 1 :
3
*/
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sq=1;
        int i=1;
        while(sq<=n){
            i++;
            sq=i*i;



        }

        System.out.print(i-1);

    }


}

