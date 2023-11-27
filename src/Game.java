import java.util.Scanner;

public class Game {
    WordSelector word = new WordSelector();
    HangmanBuilder display = new HangmanBuilder();
    Rules rules = new Rules();
    Scanner scan = new Scanner(System.in);
    LetterValidator checker = new LetterValidator();
    WordDisplay wordDisplay = new WordDisplay();

    // String gameWord = word.Word();
    String gameWord = "banana";

    String letter;
    int chancesLeft = 7;

    public void begin() {

        rules.displayRules();
        String gameString = wordDisplay.displayWordStart(gameWord);

        while (chancesLeft >= 0 ) {
            System.out.println();
            System.out.println("Please enter a letter");
            letter = scan.nextLine();
            Boolean result = checker.validator(letter, gameWord);

            if(!result) {
                chancesLeft -= 1;
                display.printGame(chancesLeft);
            } 

            gameString = wordDisplay.correctAnswer(letter, gameWord, gameString);
            System.out.println(gameString);

            if(!gameString.contains("_")) {
                System.out.println("You win");
                break;
            }

            if(chancesLeft == 0) {
                System.out.println();   
                System.out.println("Game Over");
                System.out.println();   
                System.out.println("The word was: " + gameWord);
                System.out.println();   
                break;
            }
        }
    }
}
