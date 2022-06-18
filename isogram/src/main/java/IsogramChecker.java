import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        Set<String> phraseNoRepet = new HashSet<>();
        phrase = phrase.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (phrase.isBlank()) return true;
        for (int i = 0; i < phrase.length(); i++) {
            if (!phraseNoRepet.add(String.valueOf(phrase.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

}
