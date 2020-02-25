package challenges.cards;

public class CardCount {
    int count = 0;

    public void count(int card) {
        if(card > 1 && card <= 6) {
            count ++;
        }

        if(card >= 10) {
            count--;
        }
    }

    public void count(String card) {
        count--;
    }

    public String getCount() {
        if(count > 0) {
            return count + " Bet";
        } else {
            return count + " Hold";
        }
    }
}
