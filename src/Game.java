import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game {
    WordUtils wordUtils = new WordUtils();
    HangmanBuilder display = new HangmanBuilder();
    Rules rules = new Rules();
    Scanner scan = new Scanner(System.in);

    String gameWord = wordUtils.Word();

    String letter;
    String incorrect = "";
    String correct = "";
    int chancesLeft = 7;
    public static final String regex = "[a-z]";
    Pattern pattern = Pattern.compile(regex);

    public void begin() {

        rules.displayRules();
        String gameString = wordUtils.displayWordStart(gameWord);

        while (chancesLeft >= 0) {
            System.out.println();
            System.out.println("Please enter a letter");
            letter = scan.nextLine();
            Boolean result = wordUtils.validator(letter, gameWord);
            Matcher matcher = pattern.matcher(letter);

            while (!matcher.find()) {
                System.out.println("this is not a letter");
                System.out.println();
                System.out.println("Please enter a letter");
                letter = scan.nextLine();
                result = wordUtils.validator(letter, gameWord);
            }

            while (incorrect.contains(letter)) {
                System.out.println("You have already guessed this letter");
                System.out.println();
                System.out.println("Please enter a different letter");
                letter = scan.nextLine();
                result = wordUtils.validator(letter, gameWord);
            }

            while (correct.contains(letter)) {
                System.out.println("You have already guessed this letter");
                System.out.println();
                System.out.println("Please enter a different letter");
                letter = scan.nextLine();
                result = wordUtils.validator(letter, gameWord);
            }

            if (!result) {
                chancesLeft -= 1;
                display.printGame(chancesLeft);
                incorrect += letter + "," + " ";
            } else {
                correct += letter;
            }

            if (incorrect != "") {
                System.out.println("Incorrect Guess: " + incorrect);
            }

            gameString = wordUtils.correctAnswer(letter, gameWord, gameString);
            System.out.println();
            System.out.println(gameString);

            if (!gameString.contains("_")) {
                System.out.println();
                System.out.println("You win");
                System.out.println();
                break;
            }

            if (chancesLeft == 0) {
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
