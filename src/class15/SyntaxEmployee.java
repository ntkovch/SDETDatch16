package class15;

public class SyntaxEmployee {
    /*
    Create a Class called SyntaxEmployee:
    Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee
    Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects
     */
    String empID;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee asghar=new SyntaxEmployee();
        asghar.empID="45Hfd1";
        asghar.salary=1187;

        SyntaxEmployee sohail=new SyntaxEmployee();
        sohail.empID="47MB78";
        sohail.salary=1587;

        System.out.println(asghar.empID+"->"+asghar.salary+"->"+SyntaxEmployee.CEO);
        System.out.println(sohail.empID+"->"+sohail.salary+"->"+SyntaxEmployee.CEO);
    }
}
