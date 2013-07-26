package ru.varpa89.codeforces.round192Div2;

import java.util.Scanner;

/**
 *
 * @author varchenko http://codeforces.ru/contest/330/problem/A
 */
public class TaskA {

    public static void main(String[] args) {
        String input = "3 4 S... .... ..S.";
        //Scanner scan = new Scanner(System.in);
        Scanner scan = new Scanner(input);

        int r = scan.nextInt();
        int c = scan.nextInt();
        for (int i = 0; i < r; i++) {
            String row = scan.next();
            System.out.println(row);
        }


    }
}
