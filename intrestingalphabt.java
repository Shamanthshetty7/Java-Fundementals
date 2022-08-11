// Code : Interesting Alphabets

// Print the following pattern for the given number of rows.
// Pattern for N = 5
// E
// DE
// CDE
// BCDE
// ABCDE

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            char ch=(char)('A'+n-i);
            while(j<=i)
            {
                System.out.print(ch);
                ch=(char)(ch+1);
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }

		
	}

}
