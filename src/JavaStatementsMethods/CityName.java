package JavaStatementsMethods;
/*
8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry

 */
import java.util.Scanner;
public class CityName
{
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        CityName cn = new CityName();
        cn.AtoF();


    }
    public void AtoF()
    {
        char ch ;
        System.out.println("Enter any alphabet 'A'TO'F' : ");
        ch = scan.next().charAt(0);
        if (ch == 'A')
        {
            System.out.println("Armagh");
        }
        else if (ch=='B')
        {
            System.out.println("Brighton");
        }
        else if (ch=='C')
        {
            System.out.println("Canterbury");
        }
        else if (ch=='D')
        {
            System.out.println("Derry");
        }
        else if (ch=='E')
        {
            System.out.println("Exeter");
        }
        else if (ch=='F')
        {
            System.out.println("Faceby");
        }
        else
            {
                System.out.print("Anyother Cityname Is Doesnot Exists");
            }



    }

}
