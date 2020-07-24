public class elseIfStatementExample {
    public static void main(String[] args) {
        int time = 22;
        if (time < 10) {
            System.out.println("Bonjour, Programmer!");
        } else if (time < 20) {
            System.out.println("Bonsoir, Programmer!");
        } else {
            System.out.println("Bonne nuit, Programmer!");
        }
    }
}

/*
    if ( condition 1 ) {
           // block of code to be executed if the conditional is true.
    } else if ( condition 2 ) {
            // block of code to be executed if the condition 1 is false and condition 2 is true.
    } else {
          // block of code to be executed if the condition 1 is false and condition 2 is false too.
    }

    The code example explains that time (22) is greater than 10, so the first condition is false.
    The next condition is in the else if statement is also false, so we move on to the
    else condition since condition 1 and 2 is both false so it prints "Bonne nuit, Programmer!".

    However, if the time was 15, our program would print out
    "Bonsoir, Programmer!".
 */