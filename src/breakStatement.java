public class breakStatement {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}

/*
The break statement is used to "jump out" of a switch statement.
The break statement can also be used to jump out of a loop.
The above example jump out of the loop when i is equal to 3.
 */