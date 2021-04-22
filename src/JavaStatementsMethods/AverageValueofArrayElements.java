package JavaStatementsMethods;
/*
19. Write a Java program to calculate the average value of array elements.
 */
public class AverageValueofArrayElements {
    public static void main(String[] args)
    {
        AverageValueofArrayElements av = new AverageValueofArrayElements();
        av.average();

    }
    public void average()
    {
        int [] array={1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1};
        double ave;

        int length = array.length;

        int sum=0;
        for(int i=0;i<array.length;i++)
        {
            sum+=array[i];
        }
        ave=sum/length;

        System.out.println("average value of array elements:"+ave);

    }
}
