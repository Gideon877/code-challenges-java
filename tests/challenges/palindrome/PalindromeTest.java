package challenges.palindrome;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Nested
    @DisplayName("ss")
    class ReverseWord {

        @Test
        void shouldReturnTrue() {
            Palindrome palindrome = new Palindrome();

            assertEquals(true, palindrome.reverseWord("civic"));
            assertEquals(true, palindrome.reverseWord("Kayak"));
            assertEquals(true, palindrome.reverseWord("Racecar"));
        }

        @Test
        void shouldReturnFalse() {
            Palindrome palindrome = new Palindrome();

            assertEquals(false, palindrome.reverseWord("thabang"));
            assertEquals(false, palindrome.reverseWord("gideon"));
            assertEquals(false, palindrome.reverseWord("King"));
        }
    }


    @Nested
    @DisplayName("ss")
    class ReversePhrase {
        @Test
        void shouldReturnTrue() {
            Palindrome palindrome = new Palindrome();

            assertEquals(true, palindrome.reversePhrase("Don't nod"));
            assertEquals(true, palindrome.reversePhrase("I did, did I"));
            assertEquals(true, palindrome.reversePhrase("My gym"));
        }

        @Test
        void shouldReturnFalse() {
            Palindrome palindrome = new Palindrome();

            assertEquals(false, palindrome.reversePhrase("Where are you"));
            assertEquals(false, palindrome.reversePhrase("I did not"));
            assertEquals(false, palindrome.reversePhrase("we house Sunday"));
        }
    }

    @Nested
//    @DisplayName("ss")
    @Disabled("Method need implementation")
    class ReverseNumber {

        @Test
        void shouldReturnTrue() {
            Palindrome palindrome = new Palindrome();

            assertEquals(true, palindrome.reverseNumber(2112));
            assertEquals(true, palindrome.reverseNumber(121));
            assertEquals(true, palindrome.reverseNumber(1991));
        }

        @Test
        void shouldReturnFalse() {
            Palindrome palindrome = new Palindrome();

            assertEquals(false, palindrome.reverseNumber(10111));
            assertEquals(false, palindrome.reverseNumber(123456789));
            assertEquals(false, palindrome.reverseNumber(010101));
        }
    }
}