public class noArgConstructor {
    int i;
    // Constructor with no parameter
    private noArgConstructor(){
        i = 5;
        System.out.println("Object created and i = " + i);
    }

    public static void main(String[] args) {
        // Calling the Constructor without any parameter.
        noArgConstructor obj = new noArgConstructor();
    }
}

/*
    N0-Arg Constructor.
    - Java Constructor may or may not have any parameters (arguments).
      If a constructor does not accept any parameter, it is known as a
      No-ArgConstructor.

      Output:
      Object created and i = 5
*/
