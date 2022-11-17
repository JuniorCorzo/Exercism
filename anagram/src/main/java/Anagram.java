import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    private String wordAnagram;
    private String wordAnagramOriginal;

    public Anagram(String wordAnagram) {
        char[] stringToChar = wordAnagram.toLowerCase().toCharArray();
        Arrays.sort(stringToChar);
        String charToString = new String(stringToChar);
        this.wordAnagram = charToString;

        this.wordAnagramOriginal = wordAnagram;
    }

    public List<String> match(List<String> wordsIsAnagram) {
        List<String> anagrams = new ArrayList<>();
        for (int i = 0; i < wordsIsAnagram.size(); i++) {
            if (!wordAnagramOriginal.toLowerCase().equals(wordsIsAnagram.get(i).toLowerCase())) {
                char[] stringToChar = wordsIsAnagram.get(i).toLowerCase().toCharArray();
                Arrays.sort(stringToChar);
                String wordsSort = new String(stringToChar);

                if (wordAnagram.equals(wordsSort)) {
                    anagrams.add(wordsIsAnagram.get(i));
                }
            }
        }
        return anagrams;
    }
}