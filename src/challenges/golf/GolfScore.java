package challenges.golf;

public class GolfScore {
    public String getScore(int par, int stroke) {
//        String return "";
        if(stroke == 1) {
            return "Hole-in-one!";
        }
        if(stroke <= par - 2) {
            return "Eagle";
        }
        if(stroke == par - 1) {
            return "Birdie";
        }
        if(stroke == par) {
            return "Par";
        }
        if(stroke == par + 1) {
            return "Bogey";
        }
        if(stroke == par + 2) {
            return "Double Bogey";
        }
        if(stroke >= par + 3) {
            return "Go Home!";
        }
        return "";
    }
}
