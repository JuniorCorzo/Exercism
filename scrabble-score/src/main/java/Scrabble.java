class Scrabble {
    private String word;

    public Scrabble(String word) {
        this.word = word.toLowerCase();
    }

    public int getScore() {
        int scrabbleScore = 0;
        for (int i = 0; i < word.length(); i++) {
            switch(String.valueOf(word.charAt(i))){
                case "a": case "e": case "i": case "o": case "u": case "l": case "n": case "r": case "s": case "t":
                    scrabbleScore += 1;
                    break;
                case "d": case "g":
                    scrabbleScore += 2;
                    break;
                case "b": case "c": case "m": case "p":
                    scrabbleScore += 3;
                    break;
                case "f": case "h": case "v": case "w": case "y":
                    scrabbleScore += 4;
                    break;
                case "k":
                    scrabbleScore += 5;
                    break;
                case "j": case "x":
                    scrabbleScore += 8;
                    break;
                case "q": case "z":
                    scrabbleScore += 10;
                    break;
            }
        }
        return scrabbleScore;
    }


}
