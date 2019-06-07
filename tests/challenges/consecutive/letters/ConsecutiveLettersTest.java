package challenges.consecutive.letters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveLettersTest {
    ConsecutiveLetters consecutiveLetters = new ConsecutiveLetters();

    @Test
    void shouldReturnTrue() {
        assertEquals(true, consecutiveLetters.solve("abc"));
        assertEquals(true, consecutiveLetters.solve("dabc"));
        assertEquals(true, consecutiveLetters.solve("v"));
    }

    @Test
    void shouldReturnFalse() {
        assertEquals(false, consecutiveLetters.solve("abbc"));
        assertEquals(false, consecutiveLetters.solve("abd"));

    }
}