package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {
        boolean summer=true;
        int temp=85;
        while (summer){
            if(temp<100){
                System.out.println("Its good I enjoy summer");
            } else if (temp>100) {
                System.out.println("Its very hot");
                break;
            }
            temp=temp+3;
            }
        }
        }

