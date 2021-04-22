package JavaStatementsMethods;

import java.util.Scanner;

/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
9. Same as above program-8 using switch statement.
 */

public class SwitchStatement {
    public static void main(String[] args) {

    }
    public void Cityname()
    {

        Scanner scan = new Scanner(System.in);
        char ch ;
        System.out.println("Enter any alphabet starts with 'A'TO'F' : ");
        ch = scan.next().charAt(0);


        switch(ch)
        {
            case 'A':
                System.out.println("America");
                break;
            case 'B':
                System.out.println("Birmingham");
                break;
            case 'C':
                System.out.println("Cambridge");
                break;
            case 'D':
                System.out.println("Derby");
                break;
            case 'E':
                System.out.println("Ely");
                break;
            case 'F':
                System.out.println("Faberstown");
                break;

            default:
                System.out.print("Anyother Cityname Is Doesnot Exists");

        }


    }


}
