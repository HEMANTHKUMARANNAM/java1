import java.util.*;

public class if_condition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a>b)
        {
            System.out.println("CONDITION SATISFIED");
        }
        else if(a+b<0)
        {
            System.out.println("SUM NEGATIVE");
        }
        else
        {
            System.out.println("NO CONDITION SATISFIED");
        }

        sc.close();
    }
}