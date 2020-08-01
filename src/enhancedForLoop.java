public class enhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        // This program calculates the sum of all elements of an integer array.
        for(int number: numbers) {
            sum = sum + number;
        }
        System.out.println("Sum = " + sum);
    }
}

