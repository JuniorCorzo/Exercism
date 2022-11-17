class ReverseString {

    String reverse(String inputString) {
        String result="";
        if (inputString.isBlank()) return result;

        for (int i = inputString.length() - 1; i >= 0; i--){
            result = result.concat(String.valueOf(inputString.charAt(i)));
        }

        return result;
    }
  
}
