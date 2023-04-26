package example.project.CodeClones;

import javax.swing.*;
import java.util.Arrays;

public class DotPlot {

    public static void printDotPlot(char[] sequence1, char[] sequence2) {
        // TODO: complete this function to print the dot plot of two string arrays
        if (sequence1.length > sequence2.length) {
            char[] temp = sequence1;
            sequence1 = sequence2;
            sequence2 = temp;
        }
        char[][] grid = new char[sequence1.length][sequence2.length];

        System.out.print(" \t");
        for (int i = 0; i < sequence2.length; i++) {
            System.out.print(sequence2[i] + "\t");
        }
        System.out.println();

        for (int row = 0; row < grid.length; row++) {
            System.out.print(sequence1[row]+"\t");
            for (int col = 0; col < grid[row].length; col++) {
                grid[row][col] = ' ';
                if (sequence1[row] == sequence2[col]) {
                    grid[row][col] = '+';
                }
                System.out.print(grid[row][col]+"\t");
            }
            System.out.println();
        }
    }
}
