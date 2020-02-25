package challenges.addition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddLettersTest {

  @Test
  void addLetters() {
      assertEquals("f", AddLetters.addLetters("a", "b", "c"));
      assertEquals("z", AddLetters.addLetters("z"));
      assertEquals("c", AddLetters.addLetters("a", "b"));
      assertEquals("c", AddLetters.addLetters("c"));
      assertEquals("a", AddLetters.addLetters("z", "a"));
      assertEquals("d", AddLetters.addLetters("y", "c", "b"));
      assertEquals("z", AddLetters.addLetters());
      assertEquals("m", AddLetters.addLetters("j","c"));
  }
}