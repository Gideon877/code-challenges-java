package challenges.missing.letter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingLetterTest {

    MissingLetter missingLetter = new MissingLetter();
    @Test
    void shouldReturnTrue() {
        assertEquals("", missingLetter.check("defcg"));
        assertEquals("E", missingLetter.check("abcdf"));
        assertEquals("", missingLetter.check("mnopq"));
        assertEquals("", missingLetter.check("rstuvw"));

    }

    @Test
    void shouldReturnFalse() {
        assertEquals("E", missingLetter.check("abcdf"));
        assertEquals("Q", missingLetter.check("OPRST"));
        assertEquals("X", missingLetter.check("vwyz"));
    }

}