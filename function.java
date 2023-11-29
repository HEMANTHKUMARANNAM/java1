import java.util.*;

public class function
{
    public static int PRINT(String name)
    {
        for(int i =0 ; i<= 5 ; i++)
        {
            System.out.println(name);
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        PRINT(a);
        sc.close();
    }
}
