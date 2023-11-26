import java.util.Scanner;

public class Game {
    WordSelector word = new WordSelector();
    HangmanBuilder display = new HangmanBuilder();
    Scanner scan = new Scanner(System.in);

    String gameWord = word.Word();

    String letter;
    int chancesLeft = 7;

    public void begin() {

        while (chancesLeft >= 0) {
            letter = scan.nextLine();
            System.out.println("Your letter was : " + letter);

            chancesLeft -= 1;
            display.printGame(chancesLeft);
        }
    }
}
