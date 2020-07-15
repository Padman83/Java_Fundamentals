public class continueStatement {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}

/*
The continue statement breaks one iteration ( in the loop ), if a specified
condition occurs, and continue with the next iteration in
the loop.

The example above skips the value of 4.
 */