public class MenuCards {
    public static void main(String[] args) {
        int r= 0;
        int s = 0;

        Choice men = new Choice();

        while(r < 1 || r > 4 ) {
            r = men.getRanks();
        }

        while(s < 1 || s > 4) {
            s = men.getSuits();
        }

        Card card1 = new Card(Ranks.ACE, Suits.CLUBS);

        System.out.println("Your choice is: ");
        card1.getDescription2(r);
        card1.getDescription3(s);





    }
}
