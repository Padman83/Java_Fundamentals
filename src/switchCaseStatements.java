public class switchCaseStatements {
    public static void main(String[] args) {

        var grade = 'F';

        switch (grade){
            case 'A':
                System.out.println("Bravo!");
                break;
            case 'B':
                System.out.println("Do better.");
                break;
            case 'C':
                System.out.println("Okay..");
                break;
            case 'D':
                System.out.println("Just passed...");
                break;
            case 'E':
                System.out.println("Study smarter....");
                break;
            case 'F':
                System.out.println("Epic failure......");
                break;
            default:
                System.out.println("Invalid grade.");
        }
        System.out.println("Your grade is " + grade);
    }
}
