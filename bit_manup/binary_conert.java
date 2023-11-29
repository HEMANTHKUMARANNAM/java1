package bit_manup;

import java.util.Scanner;

public class binary_conert 
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("");
        System.out.print("ENTER A DECIMAL NUMBER :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0)
        {
            sb.insert(0, Integer.toString(a%2));
            a = (int)a/2;
        }

        System.out.println(sb);
        sc.close();
    }

}
