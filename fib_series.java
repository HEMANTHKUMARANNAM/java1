import java.util.Scanner;

public class fib_series 
{
    public static int series(int num)
    {
        if (num==1)
        {
            return 0;
        }
        if (num ==2)
        {
            return 1;
        }
        else
        {
            return (series(num-1) + series(num -2));
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i =1 ; i<= a; i++ )
        {
            System.out.println(series(i)); 
        }

        sc.close();
    }
}
