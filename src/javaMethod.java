class javaMethod {
    public static void main(String[] args) {
        System.out.println("About to encounter a method.");

        // Calling the method.
        myMethod();
    }

    // Method Definition.
    private static void myMethod(){
        System.out.println("Printing from inside the myMethod()!");
    }
}

/*
    1. We have a method named myMethod().
       The method doesn't accept any arguments. Also, the return type of the
       method is void ( means doesn't return any value ).

    2. The method is static. Hence, we have called the method without creating an
       object of the class.
 */