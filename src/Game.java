import java.util.Scanner;

public class Game {
    WordSelector word = new WordSelector();
    HangmanBuilder display = new HangmanBuilder();
    Rules rules = new Rules();
    Scanner scan = new Scanner(System.in);
    LetterValidator checker = new LetterValidator();

    String gameWord = word.Word();

    String letter;
    int chancesLeft = 7;

    public void begin() {

        rules.displayRules();
        System.out.println(gameWord.length());

        while (chancesLeft >= 0) {
            System.out.println();
            System.out.println("Please enter a letter");
            letter = scan.nextLine();
            Boolean result = checker.validator(letter, gameWord);

            if(!result) {
                chancesLeft -= 1;
                display.printGame(chancesLeft);
            }
        }
    }
}
