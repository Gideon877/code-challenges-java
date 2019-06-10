package challenges.missing.letter;

import challenges.consecutive.letters.ConsecutiveLetters;

import java.util.Arrays;
import java.util.List;

public class MissingLetter extends ConsecutiveLetters {
    public String check(String stringOfLetters) {
        char sortedLetters[] = stringOfLetters.toUpperCase().toCharArray();
        List<Alphabets> alphabetsList = Arrays.asList(Alphabets.values());
        Arrays.sort(sortedLetters);
        for (int i = 0; i < stringOfLetters.length(); i++) {
            if ((i - 1) >= 0) {
                if (sortedLetters[i] - sortedLetters[i - 1] != 1) {
                    String index = String.valueOf(sortedLetters[i]);
                    Alphabets current = Alphabets.valueOf(index);

                    int currentIndex = alphabetsList.indexOf(current) - 1;
                    return String.valueOf(alphabetsList.get(currentIndex));
                }
            }
        }
        return "";
    }
}
