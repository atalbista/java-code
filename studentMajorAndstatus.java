//4.18(Student major and status) Write a program that prompts the user to enter two
//characters and displays the major and status represented in the characters. The first
//character indicates the major and the second is number character 1, 2, 3, 4, which
//indicates whether a student is a freshman, sophomore, junior, or senior. Suppose
//the following chracters are used to denote the majors:
//M: Mathematics
//C: Computer Science
//I: Information Technology
//Here is a sample run:


import java.util.Scanner;

public class studentMajorAndstatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two-character code: ");
        String input = sc.nextLine();
        if (input.length() != 2) {
            System.out.println("Invalid input. Please enter a two-character code.");
            return;
        }
        char majorChar = Character.toUpperCase(input.charAt(0));
        char statusChar = input.charAt(1);

        String major;
        switch (majorChar) {
            case 'M':
                major = "Mathematics";
                break;
            case 'C':
                major = "Computer Science";
                break;
            case 'I':
                major = "Information Technology";
                break;
            default:
                System.out.println("Invalid major code.");
                return;
        }

        String status;
        switch (statusChar) {
            case '1':
                status = "Freshman";
                break;
            case '2':
                status = "Sophomore";
                break;
            case '3':
                status = "Junior";
                break;
            case '4':
                status = "Senior";
                break;
            default:
                System.out.println("Invalid status code.");
                return;
        }

        System.out.println("Major: " + major + ", Status: " + status);
    }
}

