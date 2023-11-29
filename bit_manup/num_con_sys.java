// package Bit_Manupulation;

import java.util.Scanner;


public class num_con_sys 
{

    //..................................................
    public static String con_dec(String var)
    {
        int index = 0;
        for(int i =0 ; i < var.length() ; i++)
        {
            if(var.charAt(i) == '.')
            {
                index = i;
                System.out.println(i);
            }
        }
        String realvar = var.substring(0, index);
        String decvar =var.substring(index +1, var.length());
        int a = Integer.valueOf(realvar);
        StringBuilder sb1 = new StringBuilder("");
        while(a>0)
        {
            sb1.insert(0, Integer.toString(a%2));
            a = (int)a/2;
        }
        String realdec = sb1.toString();

        int b = Integer.valueOf(decvar);
        StringBuilder sb2 = new StringBuilder("");
        double c = b * (Math.pow(10, -decvar.length()));
        System.out.println(c);
        int count = 0;
        while(c>0)
        {
            System.out.println(c);
            c = c*2;
            if(c-1 <0)
            {
                sb2.append('0');
            }
            else if( c -1 >0)
            {
                sb2.append('1');
                c = c-1;
            }
            else if(c -1 ==0)
            {
                sb2.append('1');
                c = c-1;
            }
            count++;

            if(count >=50)
            {
                break;
            }
        }
        String decidec = sb2.toString();
        StringBuilder final_ = new StringBuilder("");
        final_.append(realdec);
        final_.append(".");
        final_.append(decidec);
        String final_re = final_.toString();
        return final_re;
    }
    //.........................................................
    

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        System.out.println(con_dec(number));
        sc.close();
    }
}
