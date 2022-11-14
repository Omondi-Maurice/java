package Question1.methods_in_java.methods;

import java.util.Scanner;

public class Methods {


    // main method
    public static void main(String[] args) {

        // my variables
        double num_1, num_2, num_3, smallnum, bignum;

        Scanner input = new Scanner(System.in);// scanner object

        // input first number
        System.out.println("\nEnter the first number: ");
        num_1 = input.nextInt();
        // input second number
        System.out.println("Enter the second number: ");
        num_2 = input.nextInt();
        // input third number
        System.out.println("Enter the third number: ");
        num_3 = input.nextInt();

        // get return values fom the methods
        smallnum = smallNum(num_1, num_2, num_3);
        bignum = bigNum(num_1, num_2, num_3);

        // output
        System.out.println("\nThe smallest number: " + smallnum);
        System.out.println("The largest number: " + bignum);
        System.out.println(bignum + " is your largest and " + smallnum + " is the smallest number.");
    }


    // method to get largest number
    static double bigNum(double num_1, double num_2, double num_3) {

        if (num_1 > num_2) {
            if (num_1 > num_3) {
                // if true, return num_1
                return num_1;
            } else {
                // else false, return num_3
                return num_3;
            }
        } else {
            if (num_2 > num_3) {
                // if true, return num_2
                return num_2;
            } else {
                // else false, return num_3
                return num_3;
            }
        }
    }

    // method to get the smallest number
    static double smallNum(double num_1, double num_2, double num_3) {

        if (num_1 < num_2) {
            if (num_1 < num_3) {
                // if true, return num_1
                return num_1;
            } else {
                // else false, return num_3
                return num_3;
            }
        } else {
            if (num_2 < num_3) {
                // if true, return num_2
                return num_2;
            } else {
                // else false, return num_3
                return num_3;
            }
        }
    }

}
