import java.util.Scanner;

public class getInputFromTheUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Contact Number: ");
        int contactNumber = input.nextInt();
        System.out.println("Your Contact Number is " + contactNumber);

        // Closing the Scanner object.
        input.close();
    }
}
