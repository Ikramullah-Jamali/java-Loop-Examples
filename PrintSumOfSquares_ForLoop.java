
import java.util.Scanner;
class PrintSumOfSquares_ForLoop
{
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter a number: ");
        num=s.nextInt();
        for(int i=1;i<=num;i++)
        {
            sum+=i*i;
        }
        System.out.println("Sum of squares of first " + num + " natural numbers is: " + sum);
        s.close();
    }
}