//7.	Write a method that will count number of digits in an given integer number.
// Example: for given number 987654, your program should return/display 6
package Geo;

import java.util.Scanner;

public class Task_7 {


    public static void main(String[] args) {
        // creates an object of Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        //read n
        int n = input.nextInt();
        input.close();
        int result = 1;
        //count numbers
        if (n != 0) {
            n = Math.abs(n);
            int l;
            for (l = 0; n > 0; ++l)
                n /= 10;
            result = l;
        }
        System.out.print("Number of digits is: " + result);
    }
}
