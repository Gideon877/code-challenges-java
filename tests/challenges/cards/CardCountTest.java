package challenges.cards;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardCountTest {
    CardCount cc = new CardCount();

    @Test
    void getCount1() {
        cc.count(2);
        cc.count(3);
        cc.count(4);
        cc.count(5);
        cc.count(6);
        assertEquals("5 Bet", cc.getCount());
    }

    @Test
    void getCount2() {
        cc.count(7);
        cc.count(8);
        cc.count(9);
        assertEquals("0 Hold", cc.getCount());
    }
    @Test
    void getCount3() {
        cc.count(10);
        cc.count("J");
        cc.count("Q");
        cc.count("K");
        cc.count("A");
        assertEquals("-5 Hold", cc.getCount());
    }
    @Test
    void getCount4() {
        cc.count(3);
        cc.count(7);
        cc.count("Q");
        cc.count(8);
        cc.count("A");
        assertEquals("-1 Hold", cc.getCount());
    }
    @Test
    void getCount5() {
        cc.count(2);
        cc.count("J");
        cc.count(9);
        cc.count(2);
        cc.count(7);
        assertEquals("1 Bet", cc.getCount());
    }
    @Test
    void getCount6() {
        cc.count(2);
        cc.count(2);
        cc.count(10);
        assertEquals("1 Bet", cc.getCount());
    }
    @Test
    void getCount7() {
//        3, 2, A, 10, K
        cc.count(2);
        cc.count(3);
        cc.count("A");
        cc.count(10);
        cc.count("K");
        assertEquals("-1 Hold", cc.getCount());
    }
}