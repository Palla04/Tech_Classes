public class Stringbuilder3 {
    public static void main(String[] args) {
        String s1 = new String("java");
        StringBuffer s2 = new StringBuffer("Python");
        StringBuilder s3 = new StringBuilder("DBMS");

        System.out.println(s2);
        s2.append(" code");
        System.out.println(s2);

        s3.append(" sql");
        System.out.println(s3);

        s2.replace(1, s2.length(), "Hello");
        System.out.println(s2);
    }
}
