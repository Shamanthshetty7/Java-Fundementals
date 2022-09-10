/*Return Array Sum

Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.
Output Format :
For each test case, print the sum of the numbers in the array/list.

Output for every test case will be printed in a separate line.



Sample Input 1:
1
3
9 8 9
Sample Output 1:
26
*/
import java.util.Scanner;
public class Solution {
	
	public static int sum(int[] arr) {
		int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
	}
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int c=s.nextInt();
        for(int j=0;j<c;j++){
        int n=s.nextInt();
        int arr[]=new int[n]; 
        for(int i=0;i<n;i++){
           arr[i]=s.nextInt();
        }
        int sum=sum(arr);
        System.out.println(sum);

        }
        
    }
}