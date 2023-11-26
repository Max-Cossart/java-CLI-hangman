public class HangmanBuilder {
    public void printGame(int chancesLeft) {
        switch (chancesLeft) {
            case 6:
            System.out.println();
                System.out.println("_|___");
                System.out.println();
                break;
            case 5:
                System.out.println();
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|___");
                System.out.println();
                break;
            case 4:
                System.out.println();
                System.out.println("  ___");
                System.out.println(" |   |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|___");
                System.out.println();
                break;
            case 3:
                System.out.println();
                System.out.println("  ___");
                System.out.println(" |   |");
                System.out.println(" |   O");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|___");
                System.out.println();
                break;
            case 2:
                System.out.println();
                System.out.println("  ___");
                System.out.println(" |   |");
                System.out.println(" |  _O_");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println("_|___");
                System.out.println();
                break;
            case 1:
                System.out.println();
                System.out.println("  ___");
                System.out.println(" |   |");
                System.out.println(" |  _O_");
                System.out.println(" |   |");
                System.out.println(" |");
                System.out.println("_|___");
                System.out.println();
                break;
            case 0:
                System.out.println();
                System.out.println("  ___");
                System.out.println(" |   |");
                System.out.println(" |  _O_");
                System.out.println(" |   |");
                System.out.println(" |  / \\");
                System.out.println("_|___");
                System.out.println();
        }
    }
}
