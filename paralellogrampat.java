// Parallelogram Pattern

// Write a program to print parallelogram pattern for the given N number of rows.
// For N = 4

// ****
//  ****
//   ****
   // ****
// The dots represent spaces.

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
         Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=0;
        while(i<n)
        {
            int j=0;
            while(j<i)
            {
                System.out.print(" ");
              j++;
            }
           int k=0;
            while(k<n)
            {
                System.out.print("*");
              k++;
            }
            
            System.out.println();

            i++;
        }

	}
}

