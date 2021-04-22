package JavaStatementsMethods;

import java.util.Scanner;

/*
2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */
public class LeapYearOrNot
{

    public static void main(String[] args) {
        LeapYearOrNot ly = new LeapYearOrNot();
        ly.leapyear();

    }

    public void leapyear()
    {
        int year;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any year : ");
        year = scan.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");

    }
}
