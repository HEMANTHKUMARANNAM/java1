import java.util.Scanner;

public class rev_str 
{
    public static void main(String args[]) 
    {
        System.out.print("ENTER THE STRING :");

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        StringBuilder sb = new StringBuilder(a);

        for(int i=0; i<sb.length()/2; i++) 
        {
            int front = i;
            int back = sb.length() - 1 - i; // 5-1-0 => 4
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.print("REVERSE STRING :");
        System.out.println(sb);

        sc.close();

    }

}