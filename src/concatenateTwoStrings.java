import java.util.Scanner;

public class concatenateTwoStrings {
    public static void main(String[] args) {

        String s1;
        String s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string : ");
        s1 = sc.nextLine();

        System.out.println("Enter the second string : ");
        s2 = sc.nextLine();

        System.out.println("String after concatenation : " +s1.concat(s2));
    }
}
