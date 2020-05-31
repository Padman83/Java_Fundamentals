public class extracting_Words_From_A_Sentence {
    public static void main(String[] args) {

        String string = "A Beautiful Life.";
        String[] words = string.split(" ", 3);

        for (String word : words){
            System.out.println(word);
        }
    }
}
