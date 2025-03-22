/* 8.4(Compute the weekly hours for each employee) Suppose the weekly hours for all  *
 * employees are stored in a two-dimensional array. Each row records an employee’s*
 * seven-day work hours with seven columns. For example, the following            *
 * array stores the work hours for eight employees. Write a program that displays *
 * employees and their total hours in decreasing order of the total hours.*/

import java.util.Arrays;
public class chp_08_04Employeehourscc {
    public static void main(String[] args) {
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        int numEmployees = hours.length;
        int[] totalHours = new int[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            int sum = 0;
            for (int j = 0; j < hours[i].length; j++) {
                sum += hours[i][j];
            }
            totalHours[i] = sum;
        }

        Integer[] indices = new Integer[numEmployees];
        for (int i = 0; i < numEmployees; i++) {
            indices[i] = i;
        }


        Arrays.sort(indices, (a, b) -> totalHours[b] - totalHours[a]);

        System.out.println("Employee\tTotal Hours");
        for (int index : indices) {
            System.out.println("Employee " + index + "\t" + totalHours[index]);
        }
    }
}
