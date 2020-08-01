public class theConstructor {
    private final int x;

    // Constructor.
    private theConstructor(){
        System.out.println("Constructor is called...");
        x = 5;
    }

    public static void main(String[] args) {
        // Constructor is called while creating object.
        theConstructor obj = new theConstructor();
        System.out.println("Value of x = " + obj.x);
    }
}

/*
    In this example, We have a private constructor named theConstructor.
    Inside the main method, we are creating an object named theConstructor of the class.

    theConstructor obj = new theConstructor();

    During this process, theConstructor is called. Hence, the print statement
    is executed and the variable x is initialized.
*/

/*
    Important Notes.

   1. Constructors are invoked implicitly when you instantiate objects.
   2. The 2 rules for creating a constructor, they are:
      a. The name of the constructor should be the same as that class.
      b. A Java constructor must not have a return type.
   3. If a class doesn't have a constructor, the Java compiler automatically
      creates a default constructor during run-time.
      The default constructor initializes instance variables with default values.
      For example, the int variable will be initialized to 0.

   4. Constructor types:
      a. No-Arg Constructor - a constructor that does not accept any arguments.
      b. Default Constructor - a constructor that is automatically created by the Java Compiler if it is not explicitly defined.
      c. Parameterized Constructor - a constructor that accepts arguments.

   5. A constructor cannot be abstract or static or final.
   6. A constructor can be overloaded but can not be overridden.
 */