package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="fgfhkhdfggh348   262354!@$#%+_(*GTWSZJK";
        System.out.println(str.replaceAll("[a-z]",""));
        System.out.println(str.replaceAll("[^a-z]",""));
        System.out.println(str.replaceAll("[^a-z0-9]",""));
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
        System.out.println(str.replaceAll("[Wf8]",""));
        System.out.println(str.replaceAll("[ ]","\\$"));
    }
}
