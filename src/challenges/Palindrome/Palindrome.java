package challenges.Palindrome;
/*
* Learned how to:
 *   - use StringBuilder
 *   - use split
 *   - use array indexes
 *         * to reverse letters
 *   - use for loop
 *   - use equalsIgnoreCase
 *   - use toString()
* */
public class Palindrome {

    public boolean reverseWord(String word) {
        return new ReverseWord(word).isPalindrome();
    }


    public boolean reverseNumber(int number) {
        //todo: reverse numbers
        return true;
    }

    public boolean reversePhrase(String phrase) {
        StringBuilder builder = new StringBuilder();
        phrase = phrase.replaceAll("\\s", "");
        phrase = phrase.replaceAll("\\'", "");

        String[] letters = phrase.split("");
        for (int i = 0; i < letters.length; i++) {
            builder.append(letters[letters.length - (i+1)]);
        }
        return builder.toString().equalsIgnoreCase(phrase);
    }
}
