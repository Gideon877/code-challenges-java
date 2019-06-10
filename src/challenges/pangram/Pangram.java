package challenges.pangram;

import challenges.consecutive.letters.ConsecutiveLetters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pangram {

    public boolean isPangram(String sentence) {
        sentence = sentence.replaceAll("\\s", "").toLowerCase();
        sentence = sentence.replaceAll("[^a-zA-Z ]", "");
        char sortedLetters[] = sentence.toCharArray();
        Arrays.sort(sortedLetters);
        List<Character> alphabets = sortCharacters(sortedLetters);
        return alphabets.size() == 26;
    }

    private List<Character> sortCharacters(char[] sortedLetters) {
        List<Character> alphabets = new ArrayList<>();
        for (char letter : sortedLetters) {
            if(!alphabets.contains(letter)) {
                alphabets.add(letter);
            }
        }
        return alphabets;
    }
}
