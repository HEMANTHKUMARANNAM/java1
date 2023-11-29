public class reverse_str 
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("HEMANTH");
        System.out.println(sb);
        int a = sb.length();
        for(int i =0 ; i< a ; i++)
        {
            sb.insert(0,sb.charAt(sb.length()-1));
            sb.delete(sb.length()-1, sb.length());
            System.out.println(sb);
            
        }
        sb.

        System.out.println(sb);
    }
}
