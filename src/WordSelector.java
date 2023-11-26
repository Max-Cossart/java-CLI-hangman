public class WordSelector {
    Words word = new Words();

    public String Word() {
        int wordIndex = (int) Math.floor(Math.random() * 172);
        return word.wordsList[wordIndex];
    }
}
