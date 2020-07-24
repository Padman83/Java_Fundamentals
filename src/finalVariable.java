public class finalVariable {
    public static void main(String[] args) {
        // Create a final variable.
        final int AGE = 30;

        // Try to change the final variable.
        // AGE = 45;
        System.out.println("Age: " + AGE);
    }
}

/*
    In this above code, we have created a final variable named age.
    And we have tried to change the value of the final variable.

    # When we run the program, we will get a compilation error with following message.
    Error:(7, 9) java: cannot assign a value to final variable AGE

    # It is recommended to use uppercase to declare final variables in Java.
 */

/*
    In Java, the final keyword is used to denote constants.
    It can be used with variables, methods, and classes.

    Once any entity (variable, method or class) is declared final, it can be assigned
    only once. That is,

    1. The final variable cannot be reinitialized with another value.
    2. The final method cannot be overridden.
    3. The final class cannot be extended.
 */