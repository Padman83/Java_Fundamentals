class DefaultConstructor {
    int a;
    boolean b;

    public static void main(String[] args) {
        // A default constructor is called.
        DefaultConstructor obj = new DefaultConstructor();
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);
    }
}

/*
   In the above program, we have not initialized the value of both
   the variables, a and b.
   However, when we create an object of the class, we can see in the output
   that the values are initialized with some values.

   It is because the Java compiler has automatically created a default constructor.
   The constructor will initialize the value of variables a and b with default
   values 0 and false.
 */