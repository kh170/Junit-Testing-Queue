import java.util.Scanner;

public class InputProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstname = input.next();

        System.out.print("Enter last name: ");
        String lastname = input.next();

        System.out.println("Full name is "+firstname+" "+lastname);
    }
}
