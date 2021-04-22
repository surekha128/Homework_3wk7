package JavaStatementsMethods;
//6.Write a java program to input any number and find out if it’s odd or even
import java.util.Scanner;
public class InputNumberAndFindOddorEven
{
    public static void main(String[] args)
    {

        InputNumberAndFindOddorEven en = new InputNumberAndFindOddorEven();
        en.even();


    }

    public void even() {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = scan.nextInt();

        if (a % 2 == 0) {
            System.out.println("Entered number is even.");

        } else {
            System.out.println("Entered number is not valid");
        }
    }
        public void odd () {
            int b;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter b number: ");
            b = scan.nextInt();

            if (b % 2 == 1) {
                System.out.println("Entered num is odd.");
            } else {
                System.out.println("Entered number is not valid");
            }
        }
    }



