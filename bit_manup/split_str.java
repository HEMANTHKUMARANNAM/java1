// package Bit_Manupulation;

import java.util.*;


public class split_str 
{
    public static void main(String[] args)
    {
        System.out.print("ENTER A NUMBER :");
        Scanner sc = new Scanner(System.in);
        String var = sc.next();

        int index = 0;
        for(int i =0 ; i < var.length() ; i++)
        {
            if(var.charAt(i) == '.')
            {
                index = i;
                System.out.println(i);
            }
        }

        System.out.println(var.substring(0, index));
        System.out.println(var.substring(index +1, var.length()));


        sc.close();
        // String dec = var.substring(index +1, var.length()).toString();

        // int dec_int = Integer.valueOf(dec);


    }
}
