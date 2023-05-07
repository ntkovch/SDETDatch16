package class16;

public class Tester {
    static String mixString(String s1, String s2) {
        String str="";
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length();i++) {
            str+=s1.charAt(i);
            str+=s2.charAt(i);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(Tester.mixString("Hello", "12345"));
    }
}
