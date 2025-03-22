//*4.8 (Find the character of an ASCII code) Write a program that receives an ASCII code
//(an integer between 0 and 127) and displays its character. Here is a sample run

 import java.util.Scanner;

public class asciiCode {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            System.out.print("Enter an ASCII code: ");
            int i = input.nextInt();


            System.out.println((char)i);

    }
}
