
import java.util.Scanner;
public class SumOfFirstnNumbers 
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num,sum=0;
        num=s.nextInt();
        for(int i=0;i<=num;i++)
        {
            sum=i+sum;
        }
        System.out.println("sum of first "+num+" numbers is: "+sum);
        s.close();
    }   
}
