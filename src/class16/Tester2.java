package class16;

public class Tester2 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="12frs";
        if(s1.length()==s2.length()){
            for (int i = 0; i < s1.length(); i++) {
                System.out.print(s1.charAt(i));
                System.out.print(s2.charAt(i));
            }
        }
    }
}
