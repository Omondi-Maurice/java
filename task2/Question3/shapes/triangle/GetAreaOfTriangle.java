package Question3.shapes.triangle;

// importing scanner
import java.util.Scanner;

public class GetAreaOfTriangle {

    // these variables are available in this class, and shared with all methods here
    static double base, height, area;

    // input the base and the height
    void getInputs() {

        // scanner object
        Scanner input = new Scanner(System.in);

        // get inputs
        System.out.println("Enter the base of the triangle : ");
        base = input.nextDouble(); // input in base
        System.out.println("Enter the height of the triangle : ");
        height = input.nextDouble(); // input in height
    }

    // get the area of the rectangle
    void getArea() {

        // area of triangle = 1/2 * base * height

        area = 1 / 2 * base * height;
    }

    // method to output area
    void getResults() {
        System.out.println("The area is: " + area);
    }

    // main method
    public static void main(String[] args) {

        // calling the non-static methods
        GetAreaOfTriangle myClassObj = new GetAreaOfTriangle();
        myClassObj.getInputs();
        myClassObj.getArea();
        myClassObj.getResults();
    }

}
