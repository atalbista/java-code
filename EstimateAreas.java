//4.4 (Geometry: area of a hexagon) The area of a hexagon can be computed using the
//following formula (s is the length of a side):
//Area = 6 * s
//2
//4 * tan¢
//p
//6 ≤
// Write a program that prompts the user to enter the side of a hexagon and displays
//its area. Here is a sample run:


import java.util.Scanner;

public class EstimateAreas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the side: ");
        double s = sc.nextDouble();

        double area =(6 * Math.pow(s,2)) /(4 * Math.tan(Math.PI / 6));

        System.out.printf("the are of the hexagon is %4.2f|n", area);

    }
}
