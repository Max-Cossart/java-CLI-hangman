public class WordUtils {
    Words word = new Words();

    public String Word() {
        int wordIndex = (int) Math.floor(Math.random() * 172);
        return word.wordsList[wordIndex];
    }

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

    public boolean validator(String letter, String word) {
        if(word.contains(letter)) {
            return true;
        } else {
            return false;
        }
    }
}
