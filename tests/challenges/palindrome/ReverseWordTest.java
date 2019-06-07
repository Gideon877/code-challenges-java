package challenges.palindrome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordTest {

    List<String> listOfWords;

    @BeforeEach
    void getReversedWord() {
        listOfWords = new ArrayList<>();
//         palindrome words
        listOfWords.add("Anna");
        listOfWords.add("Civic");
        listOfWords.add("Level");
        listOfWords.add("Kayak");
        listOfWords.add("Racecar");
        listOfWords.add("Redder");
        listOfWords.add("Sagas");
        listOfWords.add("Rotator");
        listOfWords.add("Tenet");
//        Not palindrome words
        listOfWords.add("Accommodate");
        listOfWords.add("Weird");
        listOfWords.add("handkerchief");
        listOfWords.add("Indict");
        listOfWords.add("Cemetery");
        listOfWords.add("conscience ");
        listOfWords.add("Rhythm");
        listOfWords.add("Embarrass");
        listOfWords.add("Phrase");
    }

    @Test
    void isPalindrome() {
        int count = 0, secondCounter = 9, firstCounter = 0;
        for (String word : listOfWords) {
            ReverseWord reverseWord = new ReverseWord(word);
            try {
                    assertEquals(true, reverseWord.isPalindrome());
                    assertEquals(firstCounter, count);
                    firstCounter++;
                } catch (AssertionFailedError e) {
                    assertEquals(false, reverseWord.isPalindrome());
                    assertEquals(secondCounter, count);
                    secondCounter++;
                }
            count++;
        }
    }

}