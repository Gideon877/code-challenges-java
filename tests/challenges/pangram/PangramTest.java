package challenges.pangram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PangramTest {
    Pangram pangram = new Pangram();
    @Test
    void isNotPangram() {
        assertEquals(false, pangram.isPangram("You shall not pass!"));
    }

    @Test
    void isPangram() {
        assertEquals(true, pangram.isPangram("The quick brown fox jumps over the lazy dog"));
    }

}