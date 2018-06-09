import java.util.InputMismatchException;
import java.util.Scanner;

public class Choice {
    public int getRanks() {
        Scanner in = new Scanner(System.in);
        System.out.println("input Ranks (1 - 4 ): ");
        System.out.println("1.   JACK");
        System.out.println("2.   ACE");
        System.out.println("3.   KING");
        System.out.println("4.   QUEEN");
        try {int x = in.nextInt();
            return x;}
        catch (InputMismatchException exc) {
            System.out.println("\n\nReally!!!???\n\n");
            return 0;
        }
    }

    public int getSuits() {
        Scanner in = new Scanner(System.in);

        System.out.println("input Suits (1- 4): ");
        System.out.println("1.    DIAMONDS");
        System.out.println("2.    CLUBS");
        System.out.println("3.    HEARTS");
        System.out.println("4.    SPADES");
        try {int y = in.nextInt();
            return y; }
        catch (InputMismatchException exc) {
            System.out.println("\n\nReally!!!!????\n\n");
            return 0;
        }

    }
}