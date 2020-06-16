public class java_Type_Casting {
    public static void main(String[] args) {

        int myInt = 9;              // Automatically casting: int to double.
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        double theDouble = 19.56;
        int theInt = (int) theDouble;  // Manual casting: double to int

        System.out.println(theDouble);
        System.out.println(theInt);
    }
}
