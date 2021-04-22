package JavaStatementsMethods;
/*
 *Created by Surekha
 */
import java.util.Scanner;
//1.Write a java program that tells us that Input number is odd or even?
// HINT: use ternary operator (? :)
public class OddEven {
    public static void main(String[] args)
    {
        OddEven oe = new OddEven();
        oe.oddeven();
    }

    public void oddeven()
    {
        int num;
        System.out.print("Enter the number for check odd or even: ");
        Scanner scan=new Scanner(System.in);
        num = scan.nextInt();
        String oddEven=(num % 2 == 0)?  "Even" : "Odd";//ternary operator for find odd and even
        System.out.println(num+" is "+oddEven);
    }

}

