package task1;


import java.util.Scanner; //importing Scanner

public class Question2 {

    
    // a static method that finds average
    static double getAverage(double unit_1, double unit_2, double unit_3, double unit_4, double unit_5) {

        // get the average
        var myAverage = (unit_1 + unit_2 + unit_3 + unit_4 + unit_5) / 5;

        // round the average
        var roundAverage = Math.round(myAverage * 100.0) / 100.0;
        return roundAverage;
    }


    // main function. This is the program starting point
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // my Scanner object

        // my variables
        double unit_1, unit_2, unit_3, unit_4, unit_5, average;

        System.out.println("Enter marks for the following to get average :");

        // inputting the five units
        // input unit 1
        System.out.println("\nUnit 1 : ");
        unit_1 = input.nextDouble();
        // input unit 2
        System.out.println("Unit 2 : ");
        unit_2 = input.nextDouble();
        // input unit 3
        System.out.println("Unit 3 : ");
        unit_3 = input.nextDouble();
        // input unit 4
        System.out.println("Unit 4 : ");
        unit_4 = input.nextDouble();
        // input unit 5
        System.out.println("Unit 5 : ");
        unit_5 = input.nextDouble();
        // get rounded average mark
        average = getAverage(unit_1, unit_2, unit_3, unit_4, unit_5);
        System.out.println("\nYour average mark : " + average);// Dispaly output
    }

}