package JavaStatementsMethods;
/*
18. Write a Java program to sum values of an array.
 */
public class SumValuesofAnArray
{
    public static void main(String[] args)
    {
        int a[] = {40,30,10,20,100,80,200};
       int  sum =0;

            for(int i : a)
            {
                sum=sum+i;
            }
        System.out.println("sum of array element is:"+sum);



    }

}
