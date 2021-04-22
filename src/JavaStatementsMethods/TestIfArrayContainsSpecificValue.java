package JavaStatementsMethods;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
20. Write a Java program to test if an array contains a specific value
 */
public class TestIfArrayContainsSpecificValue {
    public static void main(String[] args) {
        TestIfArrayContainsSpecificValue csv = new TestIfArrayContainsSpecificValue();
        csv.specific();
    }

    public void specific() {
Scanner scan = new Scanner(System.in);
        System.out.println("Enter any value: ");
        int bar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int num;
        num=scan.nextInt();

        for (int i = 0; i < bar.length; i++) {
            if (num == bar[i]) {
                System.out.println("Array contains the given element");
            }
            else{
                System.out.println("Array is not contains the given element");
            }


        }
    }
}


