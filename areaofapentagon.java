//4.1(Geometry: area of a pentagon) Write a program that prompts the user to enter
//the length from the center of a pentagon to a vertex and computes the area of the
//pentagon, as shown in the following figure.
//          r
// The formula for computing the area of a pentagon is Area = 5 * s
//2
//4 * tan¢
//p
//5 ≤
//, where
//s is the length of a side. The side can be computed using the formula s = 2r sin p 5
// where r is the length from the center of a pentagon to a vertex. Round up two digits
//after the decimal point. Here is a sample run:

import java.util.Scanner;

public class areaofapentagon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the length from the center to a vertex:");
        double r = sc.nextDouble();

        double s = (2*r) * Math.sin(Math.PI /5);
        double area = (5* Math.pow(s,2)) / (4* Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon is %5.2f\n" , area);


    }
}
