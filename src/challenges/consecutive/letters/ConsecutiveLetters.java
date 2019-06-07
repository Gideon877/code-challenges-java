package challenges.consecutive.letters;

import java.util.ArrayList;
import java.util.Arrays;

public class ConsecutiveLetters {
    public boolean solve(String letters) {
        char sortedLetters[] = letters.toCharArray();
        Arrays.sort(sortedLetters);
        for (int i = 0; i < letters.length(); i++) {
            if ((i - 1) >= 0) {
                if (sortedLetters[i] - sortedLetters[i - 1] != 1) {
                      return false;
                }
            }
        }
        return true;
    }
}
