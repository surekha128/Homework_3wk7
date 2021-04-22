package JavaStatementsMethods;

import java.util.Arrays;

/*
17. Write a Java program to sort a numeric array and a string array.
 */
public class SortNumericandStringArray
{
    public static void main(String[] args)
    {
        int[] d = {40,30,10,20,50,100,80,110,150,200};
        System.out.println("original numeric array : ");
     for (int i:d)
     {
         System.out.println(i + " ");
     }
        System.out.println("sorted numeric array: ");
     Arrays.sort(d);
        System.out.println(Arrays.toString(d));

        String[] name ={"krish","binni","raj","nik","mitali","tanu","arya"};
        for(String i:name)         //for each loop to print array elements
        {
            System.out.println(i + " ");
        }
        System.out.println("sorted string array: ");
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
    }


}
