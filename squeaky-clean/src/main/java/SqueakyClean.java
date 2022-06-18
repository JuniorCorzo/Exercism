class SqueakyClean {
    static String clean(String identifier) {
        String result = identifier.replaceAll(" ", "_");
        result = result.replaceAll("\0", "CTRL");

        char[] identifierConvertChar = result.toCharArray();
        for (int i = 0; i < identifierConvertChar.length; i++) {
            if(identifierConvertChar[i] == "-".charAt(0)){
                identifierConvertChar[i + 1] = String.valueOf(identifierConvertChar[i + 1]).toUpperCase().charAt(0);
            }
            
        }
        result = String.valueOf(identifierConvertChar).replaceAll("-", "");
        return result.replaceAll("[0-9α-ω\uD83D\uDE00]", "");
    }
}
