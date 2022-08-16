// Sum Pattern

// Write a program to print triangle of user defined integers sum.

// Sample Input 1 :
// 3
// Sample Output 1 :
// 1=1
// 1+2=3
// 1+2+3=6

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
       while(i<=n)
       {
           int p=1;
        
           for(int k=1;k<=2*i-1;k++)
           {
               if(k%2==0){
                   System.out.print("+");
               }
               else
               {
                   System.out.print(p);
                   p=p+1;

               }
               
               
           }
           System.out.print("=");
           int sum=0;
           for(int j=1;j<=i;j++)
           {
               sum=sum+j;
               
           }
           System.out.print(sum);
           System.out.println();
           i=i+1;

       }
        
	}
}
