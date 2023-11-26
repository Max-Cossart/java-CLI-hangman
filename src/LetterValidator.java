public class LetterValidator {
    
    public boolean validator(String letter, String word) {
        if(word.contains(letter)) {
            return true;
        } else {
            return false;
        }
    }
}