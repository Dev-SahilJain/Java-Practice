import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("enter your employee id : ");
        Scanner in = new Scanner(System.in);
        int empID= in.nextInt();

        switch(empID){
            case 1 -> System.out.println("Welcome Sahil");
            case 2 -> System.out.println("Welcome Jain");
            case 3 -> {
                String department = in.next();
                System.out.println("emp no. 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    case "Sales" -> System.out.println("Sales Department");
                    default -> System.out.println("enter valid department !");
                }
            }
            default -> System.out.println("Enter valid empID");
        }
    }
}