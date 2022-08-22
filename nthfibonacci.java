// Nth Fibonacci Number

// Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
  //  F(n) = F(n-1) + F(n-2), 
   // Where, F(1) =  0, 
    //       F(2) = 1
 // Provided N you have to find out the Nth Fibonacci Number.

 // Sample Input 1:
//6
// Sample Output 1:
// 8
// Explanation of Sample Input 1:
// Now the number is ‘6’ so we have to find the “6th” Fibonacci number
// So by using the property of the Fibonacci series i.e 

// [ 1, 1, 2, 3, 5, 8]
// So the “6th” element is “8” hence we get the output.

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==1){
            System.out.print("1");

        }
        else{
        int p=0;
        int c=1;
        int fi=0;
        for(int i=1;i<n;i++)
        {
         fi=p+c;
         p=c;
         c=fi;
        }
        System.out.print(fi);

        }
	}

}
