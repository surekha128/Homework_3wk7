package JavaStatementsMethods;

import java.util.Scanner;

/*
16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
 */
public class NumIsPositiveNegativeorZero
{
    public static void main(String[] args)
    {
        NumIsPositiveNegativeorZero num = new NumIsPositiveNegativeorZero();
        num.numis();

    }
    public void numis() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num: ");
        int w;
        w = scan.nextInt();

        if (w > 0) {
            System.out.println("is positive number");
        } else if (w < 0)
        {
            System.out.println("is negative number");
        }
        else if (w==0)
        {
            System.out.println("is zero number");
        }
        else
        {
            System.out.println("number is invalid");
        }

    }

}