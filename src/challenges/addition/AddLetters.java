package challenges.addition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddLetters {
    public static String addLetters(String... letters) {
        List<String> alphabeth = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        int listSize = letters.length;
        if(listSize < 1) return "z";
        int count = 0;

        for (int i = 0; i < letters.length; ++i) {
            count += alphabeth.indexOf(letters[i]) + 1;
        }

        if(count > 26) {
            count = count - 26;
        }
        return alphabeth.get(count - 1);
    }
}
