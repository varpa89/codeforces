package ru.varpa89.codeforces.round192Div2;

import java.util.Scanner;

/**
 *
 * @author varchenko http://codeforces.ru/contest/330/problem/A
 */
public class TaskA {

    public static void main(String[] args) {
        //String input = "3 4 S... .... ..S.";
        //Scanner scan = new Scanner(input);
        Scanner scan = new Scanner(System.in);

        int r = scan.nextInt();
        int c = scan.nextInt();

        //Инициализируем матрицу
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            String row = scan.next();
            for (int j = 0; j < row.length(); j++) {
                int point = 0;
                if ("S".equals(Character.toString(row.charAt(j)))) {
                    point = 1;
                }
                matrix[i][j] = point;
            }
        }

        // Идем по строкам
        for (int i = 0; i < r; i++) {
            Boolean stringHasStraw = false;
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 1) {
                    stringHasStraw = true;
                    break;
                }
            }
            if (!stringHasStraw) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = 2;
                }
            }
        }

        // Идем по столбцам
        for (int i = 0; i < c; i++) {
            Boolean columnHasStraw = false;
            for (int j = 0; j < r; j++) {
                if (matrix[j][i] == 1) {
                    columnHasStraw = true;
                    break;
                }
            }
            if (!columnHasStraw) {
                for (int j = 0; j < r; j++) {
                    matrix[j][i] = 2;
                }
            }
        }

        //Считаем ячейки
        int cellCount = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 2) {
                    cellCount++;
                }
            }
        }

        System.out.println(cellCount);


    }
}
