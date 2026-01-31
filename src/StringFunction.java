public class StringFunction {
    public static void main(String[]args)
    {
        String s1="java";
        String s2= new String("JAVA");
        String s3="JAVA";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1.toUpperCase());
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);
    }
}
