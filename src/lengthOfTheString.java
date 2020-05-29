import java.util.Scanner;

public class lengthOfTheString {
    public static void main(String[] args) {
        String text;
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter a String : ");
        text = SC.nextLine();

        int length = text.length();
        System.out.println("The length of the given string " + text+ " is : " +length );
    }
}
