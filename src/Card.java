

public class Card {


    public Ranks xy;
    public Suits yy;
    public Suits mySuit;
    public Ranks myRank;



    public Card (Ranks xy, Suits yy) {
        this.xy = xy;
        this.yy = yy;
    }



    public void getDescription2(int x) {
        switch (x) {
            case 1:
                myRank = Ranks.JACK;
                System.out.print(myRank + " of ");
                return;
            case 2:
                myRank = Ranks.ACE;
                System.out.print(myRank + " of ");
                return;
            case 3:
                myRank = Ranks.KING;
                System.out.print(myRank + " of ");
                return;
            case 4:
                myRank = Ranks.QUEEN;
                System.out.print(myRank + " of ");
                return;
            default:
                myRank =Ranks.WRONG_CHOICE;
                System.out.print(myRank);
                return;


        }

    }
    public void getDescription3(int y) {
        switch (y) {
            case 1:
                mySuit = Suits.DIAMONDS;
                System.out.print(mySuit);
                return;
            case 2:
                mySuit = Suits.CLUBS;
                System.out.print(mySuit);
                return;
            case 3:
                mySuit = Suits.HEARTS;
                System.out.print(mySuit);
                return;
            case 4:
                mySuit = Suits.SPADES;
                System.out.print(mySuit);
            default:
                mySuit = Suits.WRONG_CHOICE;
                System.out.print(myRank);
                return;
        }
    }



}
