public class extractWords {
    public static void main(String[] args) {

        String string = "Berlin, Madrid, Stockholm, Rome, Paris, Tokyo.";
        String[] words = string.split(" ",6);

        for (String word : words){
            System.out.println(word);
        }
    }
}
