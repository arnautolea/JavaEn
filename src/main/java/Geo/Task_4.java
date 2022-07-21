//4.	Define a method that will calculate the sum of 2 numbers.
// (For example: given number a=8 and b=0, your program should display "Sum of a and b is 8")

package Geo;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        // creates an object of Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number a: ");
        //read a
        int a = input.nextInt();
        System.out.print("Enter number b: ");
        //read b
        int b = input.nextInt();
        int c = a+b;
        System.out.print("Sum of a and b is : " + c);
        // closes the scanner
        input.close();
    }
}

// (For example: given number a=8 and b=0, your program should display "Sum of a and b is 8")
/*public class Task_4 {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;
        System.out.print("Sum of a and b is : " + (a+b));
    }
}*/