class RotationalCipher {
    public int shiftKey;

    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    String rotate(String data) {
        String cipherString = "";
        if (shiftKey == 26 || shiftKey == 0) return data;
        for (int i = 0; i < data.length(); i++) {
            char c;
            int index = 0;
            if(data.charAt(i) != ' '){
                for (c = data.toLowerCase().charAt(i); c <= 'z'; c++){
                    if(!Character.isAlphabetic(data.charAt(i)) ) break;
                    if (index < shiftKey){
                        if (c == 'z') {
                            c = 'a';
                            c -= 1;
                        } 
                        index++;
                    } else {
                        break;
                    }
                    
                }

                if(String.valueOf(data.charAt(i)).equals(String.valueOf(data.charAt(i)).toUpperCase())){
                    cipherString = cipherString.concat(String.valueOf(c).toUpperCase());
                } else{
                    cipherString = cipherString.concat(String.valueOf(c));

                }

            } else{
                cipherString = cipherString.concat(String.valueOf(data.charAt(i)));
            }
            
        }
        

        return cipherString;
    }

}
