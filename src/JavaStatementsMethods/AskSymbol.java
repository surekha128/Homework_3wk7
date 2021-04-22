package JavaStatementsMethods;
/*
.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
 */

import java.util.Scanner;

public class AskSymbol
{
    public static void main(String[] args)
    {
AskSymbol s = new AskSymbol();
s.symbol();
s.method();
    }
    public void symbol()
    {
        System.out.println("select operator:+,-,*,/");
        System.out.println("Enter any operator: ");
    }
  public void method()
  {
      Scanner scan =new Scanner(System.in);
      int a, b, res;
      char ch;
      ch =scan.next().charAt(0);
      System.out.println("Enter value of a: ");
      a=scan.nextInt();
      System.out.println("Enter value of b: ");
      b=scan.nextInt();
      if(ch == '+')
      {

          System.out.println(a + b);
      }
      else if(ch == '-')
      {

          System.out.println(a - b);
      }
      else if(ch == '*')
      {

          System.out.println(a * b);
      }
      else if(ch == '/')
      {

          System.out.println(a / b);
      }
      else
      {
          System.out.println("Cannot recognize the operator!cannot intialize value");
      }

  }

}
