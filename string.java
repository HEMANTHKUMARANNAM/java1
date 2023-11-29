import java.util.*;

public class string
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        String full_name = sc.nextLine();
        System.out.println(full_name);

        String name = sc.next();
        System.out.println(name);

        System.out.println(name.length());
        System.out.println(full_name.length());

        for(int i =0 ; i< name.length() ; i++)
        {
            System.out.println(name.charAt(i));
        }


        for(int i =0 ; i< full_name.length() ; i++)
        {
            System.out.println(full_name.charAt(i));
        }

        System.out.println(name.substring(1, name.length()));

        sc.close();
    }
}