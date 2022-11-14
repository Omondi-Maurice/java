package Question2;

//importing Scanner
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        // scanner object
        Scanner input = new Scanner(System.in);

        // my variables
        double marksForJava, marksForNetworking, marksForMath, average; 

        // input java marks
        System.out.println("Enter marks for Java Programming: ");
        marksForJava = input.nextInt(); 

        // input networking marks
        System.out.println("Enter marks for Networking: ");
        marksForNetworking = input.nextInt(); 
        
        // input maths marks
        System.out.println("Enter marks for Maths: ");
        marksForMath = input.nextInt(); 

        // output
        System.out.println("\nMarks for Java Programming is: " + marksForJava);
        System.out.println("Marks for Networking: " + marksForNetworking);
        System.out.println("Marks for Maths: " + marksForMath);

        // calculate the average
        average = (marksForJava + marksForNetworking + marksForMath) / 3;

        // output the average
        System.out.println("\nThe average is: " + average);
    }

}
