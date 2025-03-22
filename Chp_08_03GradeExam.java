/* *8.3 (Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the
students in increasing order of the number of correct answers */


import java.lang.reflect.Array;
import java.util.Arrays;

public class Chp_08_03GradeExam {
    public static void main(String[] args) {
        char[] answers = { 'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D' };

        char[][] studentAnswers = {
                { 'A', 'D', 'A', 'C', 'C', 'A', 'B', 'A', 'C', 'D' },
                { 'D', 'D', 'A', 'B', 'C', 'A', 'B', 'A', 'C', 'D' },
                { 'E', 'D', 'A', 'E', 'C', 'A', 'B', 'A', 'C', 'D' },
                { 'A', 'D', 'D', 'C', 'C', 'A', 'B', 'A', 'C', 'D' },
                { 'B', 'D', 'A', 'C', 'C', 'A', 'B', 'A', 'C', 'D' },
                { 'B', 'D', 'A', 'C', 'C', 'A', 'B', 'E', 'C', 'D' },
                { 'B', 'D', 'A', 'C', 'C', 'A', 'B', 'A', 'C', 'D' },
                { 'B', 'D', 'A', 'C', 'C', 'A', 'B', 'A', 'E', 'D' }
        };
        int[] grades = new int[studentAnswers.length];

        for (int i = 0; i<studentAnswers.length; i++) {
            for (int j=0; j<studentAnswers.length; j++) {
                if ( studentAnswers [i][j]==answers[j]) {
                    grades [i]++;
                }
            }
        }

        Integer[] indices =new Integer[grades.length];
        for (int i=0; i<indices.length; i++) {
            indices[i] = i;
        }
            Arrays.sort(indices,(a, b) -> grades[a] - grades[b]);

        for (int index : indices) {
            System.out.println("Student " + index + "'s correct count is " + grades[index]);

        }
    }
}
