/*Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.

Sample Input 1:
9
Sample Output 1:
2
3
5
*/


import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int num = 1; num <= n; num++)
		{
			int count = 0;
		    for (int i = 2; i <= num/2; i++)
		    {
		    	if(num% i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && num != 1 )
		    {
		    	System.out.println(num );
		    }  
            

        }

    }
}
