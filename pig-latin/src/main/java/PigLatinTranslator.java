import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PigLatinTranslator {

    public String translate(String phrase) {
        String wordTranslatedResult  = "";
        List<Character> vocals = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        List<String> wordsSeparate = new ArrayList<>(Arrays.asList(phrase.split(" ")));

        int index = 0;
        while (index < wordsSeparate.size()) {
            LinkedList<String> pigTranslated = new LinkedList<>();
            int wordLength = wordsSeparate.get(index).length();
            for (int i = 0; i < wordLength; i++) {
                if (wordsSeparate.get(index).charAt(0) == 'x' && wordsSeparate.get(index).charAt(1) == 'r'){
                    pigTranslated.add(wordsSeparate.get(index));
                    break;
                }
                if (wordsSeparate.get(index).charAt(0) == 'y' && !vocals.contains(wordsSeparate.get(index).charAt(1))){
                    pigTranslated.add(wordsSeparate.get(index));
                    break;
                } else if (wordsSeparate.get(index).charAt(1) == 'y') {
                    wordsSeparate.set(index, wordsSeparate.get(index).replaceAll("y", ""));
                    pigTranslated.push("y");
                    pigTranslated.add(wordsSeparate.get(index));
                    break;
                } else if (wordsSeparate.get(index).length() > 2 && wordsSeparate.get(index).charAt(1) == 'h' && wordsSeparate.get(index).charAt(2) == 'y') {
                    pigTranslated.add(wordsSeparate.get(index).substring(2));
                    pigTranslated.add(wordsSeparate.get(index).substring(0, 2));
                    break;
                } else if (vocals.contains(wordsSeparate.get(index).charAt(0))) {
                    pigTranslated.push(wordsSeparate.get(index));
                    break;
                }

                if (wordsSeparate.get(index).length() > 1 && wordsSeparate.get(index).charAt(0) == 'q' && wordsSeparate.get(index).charAt(1) == 'u'){
                    pigTranslated.add(String.valueOf(wordsSeparate.get(index).charAt(0)));
                    pigTranslated.add(String.valueOf(wordsSeparate.get(index).charAt(1)));
                    wordsSeparate.set(index, wordsSeparate.get(index).substring(2));
                }
                if (!vocals.contains(wordsSeparate.get(index).charAt(0)) && wordsSeparate.get(index).charAt(1) == 'q'
                        && wordsSeparate.get(index).charAt(2) == 'u') {
                    pigTranslated.add(String.valueOf(wordsSeparate.get(index).charAt(0)));
                    pigTranslated.add(String.valueOf(wordsSeparate.get(index).charAt(1)));
                    pigTranslated.add(String.valueOf(wordsSeparate.get(index).charAt(2)));
                    wordsSeparate.set(index, wordsSeparate.get(index).substring(3));
                } else {
                    if (!vocals.contains(wordsSeparate.get(index).charAt(0))) {
                        pigTranslated.add(String.valueOf(wordsSeparate.get(index).charAt(0)));
                        wordsSeparate.set(index, wordsSeparate.get(index).substring(1, wordsSeparate.get(index).length()));
                    }
                }
                
            }
            pigTranslated.add(" ");
            for (int i = 0; i < pigTranslated.size(); i++) {
                if (pigTranslated.get(i).isBlank()){
                    wordTranslatedResult = wordTranslatedResult.concat("ay ");
                } else {
                    wordTranslatedResult = wordTranslatedResult.concat(pigTranslated.get(i));
                }
            }
            
            index++;
        }
        return wordTranslatedResult.trim();
    }
}