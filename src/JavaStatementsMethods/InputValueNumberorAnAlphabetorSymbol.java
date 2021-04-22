package JavaStatementsMethods;

import java.util.Scanner;

/*
12. Write a program that tells us input value is number or an alphabet or symbol
 */
public class InputValueNumberorAnAlphabetorSymbol
{
    public static void main(String[] args) {
        InputValueNumberorAnAlphabetorSymbol iv = new InputValueNumberorAnAlphabetorSymbol();
        iv.valuenumber();
    }


        public void valuenumber ()
        {

        Scanner scan = new Scanner(System.in);
            System.out.println("Enter a character/number/symbol: ");
        char ch;
        ch=scan.next().charAt(0);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
        {
            System.out.println("this is an alphabet");

        } else if (ch >= '0' && ch <= '9')
        {
            System.out.println("this is a number");
        } else
            {
            System.out.println("this is a symbol");
        }


    }
}
