/* Arrange Numbers In Array

You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
Note:
You need not print the array. You only need to populate it.

For each test case, print the elements of the array/list separated by a single space.

Output for every test case will be printed in a separate line.



Sample Input 1 :
1
6
Sample Output 1 :
1 3 5 6 4 2

*/
import java.util.Scanner;
public class Solution {

    public static void arrange(int arr[], int n) {
        if(n==0){
            return ;
        }
        int s=0;
        int e=n-1;
        int value=1;
        while(e>=n/2){
            arr[s]=value;
            value++;
            arr[e]=value;
            s++;
            e--;
            value++;
            if(s==e){
               arr[s]=value;
               break;
            }
        }

    }




    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int c=s.nextInt();
        for(int j=0;j<c;j++){
            int n=s.nextInt();
            int arr[]=new int[n]; 
            arrange(arr,n);

        }

    }
}