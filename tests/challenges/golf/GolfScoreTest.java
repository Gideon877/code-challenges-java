package challenges.golf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GolfScoreTest {
    GolfScore score = new GolfScore();

    @Test
    void getGolfNickNames()  {
        assertEquals("Hole-in-one!", score.getScore(4, 1));
        assertEquals("Eagle", score.getScore(4, 2));
        assertEquals("Eagle", score.getScore(5, 2));
        assertEquals("Birdie", score.getScore(4, 3));
        assertEquals("Par", score.getScore(4, 4));
        assertEquals("Hole-in-one!", score.getScore(1, 1));
        assertEquals("Par", score.getScore(5, 5));
        assertEquals("Bogey", score.getScore(4, 5));
        assertEquals("Double Bogey", score.getScore(4, 6));
        assertEquals("Go Home!", score.getScore(4, 7));
        assertEquals("Go Home!", score.getScore(5, 9));
    }

}

//    golfScore(4, 1) should return "Hole-in-one!"
//        golfScore(4, 2) should return "Eagle"
//        golfScore(5, 2) should return "Eagle"
//        golfScore(4, 3) should return "Birdie"
//        golfScore(4, 4) should return "Par"
//        golfScore(1, 1) should return "Hole-in-one!"
//        golfScore(5, 5) should return "Par"
//        golfScore(4, 5) should return "Bogey"
//        golfScore(4, 6) should return "Double Bogey"
//        golfScore(4, 7) should return "Go Home!"
//        golfScore(5, 9) should return "Go Home!"