

public class string_builder
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("HEMANTH");
        System.out.println(sb);

        sb.setCharAt(0, 'A');
        System.out.println(sb);

        sb.insert(0,'H');
        System.out.println(sb);

        sb.delete(1,2);
        System.out.println(sb);

        sb.append(" KUMAR");
        System.out.println(sb);
    }
}