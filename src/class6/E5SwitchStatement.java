package class6;

public class E5SwitchStatement {
    public static void main(String[] args) {
        char gender='h';
        switch (gender){
            case 'F':
                System.out.println("Female");
                break;
            case'M':
                System.out.println("Male");
                break;
            case '0':
                System.out.println("Others");
            default:
                System.out.println("Char not supported");
        }
    }
}
