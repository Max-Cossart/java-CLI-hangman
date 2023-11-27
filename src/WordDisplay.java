public class WordDisplay {

    public String displayWordStart(String word) {
        String display = "";
        for(int i = 0; i < word.length(); i++) {
            display += "_ ";
        }
        return display;
    }

    public String correctAnswer(String letter, String word, String gameString) {
        String[] splitWord = word.split("");
        String[] displayString = gameString.split(" ");

        for(int i = 0; i < word.length(); i++) {
            if(letter.matches(splitWord[i])) {
                displayString[i] = splitWord[i];
            }
        }
        return String.join(" ", displayString);
    }
}