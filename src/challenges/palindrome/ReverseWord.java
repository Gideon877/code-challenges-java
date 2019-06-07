package challenges.palindrome;

public class ReverseWord {

    private final String word;
    private String reverseWord;

    public ReverseWord(String word){
        this.word = word;
        this.reverseWord = reverseWord();
    }

    public String getReversedWord() {
        return reverseWord;
    }

    private String reverseWord() {
        StringBuilder builder = new StringBuilder();
        String[] letters = word.split("");
        for (int i = 0; i < letters.length; i++) {
            builder.append(letters[letters.length - (i+1)]);
        }
        return builder.toString();
    }

    public boolean isPalindrome() {
        return reverseWord.equalsIgnoreCase(word);
    }
}
