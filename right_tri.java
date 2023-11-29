import java.util.*;
public class right_tri
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int j =0 ; j <= n ; j++ )
        {
            for(int i=0; i<=n ; i++)
            {
                if(i<=j)
                {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }

        sc.close();
    }
}