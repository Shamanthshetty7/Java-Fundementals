// Total Salary
// Write a program to calculate the total salary of a person. 
// The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
//   totalSalary = basic + hra + da + allow – pf

// hra   = 20% of basic
// da    = 50% of basic
// allow = 1700 if grade = ‘A’
// allow = 1500 if grade = ‘B’
// allow = 1300 if grade = ‘C' or any other character
// pf    = 11% of basic.

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int basic=s.nextInt();
        String str=s.next();
        char ch=str.charAt(0);
        float hra=basic*(20/100f);
        float da=basic*(50/100f);
        float pf=basic*(11/100f);
        char allow;
        if(ch=='A')
        {
            allow=1700;
        }
        else if(ch=='B')
        {
            allow=1500;
        }
        else{
            allow=1300;
        }
        double TS=(basic+hra+da+allow-pf);
      int ts=(int)(java.lang.Math.round(TS));
        System.out.println(ts);
    }
}
