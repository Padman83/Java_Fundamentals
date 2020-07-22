class finalMethod {
    // Create a final method.
    public static void main(String[] args) {
        System.out.println("This is a final method.");
    }
}

class Main extends finalMethod {
    // Try to override the final method.
    public static void display() {
        System.out.println("The final method is overridden.");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.display();
    }
}

/*
    In the code example, we have created a final method named display() inside
    the finalMethod class.
    Here, the Main class inherits the finalMethod class.

    When we tried to override the final method in the Main class.
    When we run the program, we will get a compilation error with the following message.

    Error:(10, 1) java: duplicate class: Main
 */