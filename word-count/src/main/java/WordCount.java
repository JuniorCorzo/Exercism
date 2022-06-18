import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public WordCount() {

    }

    public Map<String, Integer> phrase(String words) {
        Map<String, Integer> wordsCounts = new HashMap<>();
        List<String> wordsSeparate = new ArrayList<>(
                Arrays.asList(words.toLowerCase().replaceAll("[^a-zA-Z0-9']", " ").split(" ")));

        while (wordsSeparate.size() != 0) {
            if (!wordsSeparate.get(0).isEmpty()) {
                if (!Character.isAlphabetic(wordsSeparate.get(0).charAt(0)) && !Character.isDigit(wordsSeparate.get(0).charAt(0))){ 
                    wordsSeparate.add(wordsSeparate.get(0).substring(1, wordsSeparate.get(0).length() - 1));
                    wordsSeparate.remove(0);
                }

                if (!wordsCounts.containsKey(wordsSeparate.get(0))) {
                    wordsCounts.put(wordsSeparate.get(0), 1);
                    wordsSeparate.remove(0);
                } else {
                    int value = wordsCounts.get(wordsSeparate.get(0));
                    wordsCounts.put(wordsSeparate.get(0), value + 1);
                    wordsSeparate.remove(0);
                }
            } else {
                wordsSeparate.remove(0);
            }

        }
        return wordsCounts;
    }
}