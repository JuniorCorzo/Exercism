import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    public List<Signal> calculateHandshake(int number) {
        List<Signal> handshake = new ArrayList<>();
        String numberBinary = convertDecimalToBinary(number);
        System.out.println(numberBinary);

        if (numberBinary.length() >= 1 && numberBinary.charAt(0) == '1'){
            handshake.add(Signal.WINK);
        }

        if (numberBinary.length() >= 2 && numberBinary.charAt(1) == '1'){
            handshake.add(Signal.DOUBLE_BLINK);
        }

        if (numberBinary.length() >= 3 && numberBinary.charAt(2) == '1'){
            handshake.add(Signal.CLOSE_YOUR_EYES);
        }
        
        if (numberBinary.length() >= 4 &&numberBinary.charAt(3) == '1'){
            handshake.add(Signal.JUMP);
        }

        if (numberBinary.length() >= 5 && numberBinary.charAt(4) == '1') {
            Collections.reverse(handshake);
        }

        return handshake;
    }

    public String convertDecimalToBinary (int number){
        String numberBinary = "";
        while (number != 0){
            if (number % 2 == 1 || number % 2 == 0){ 
                numberBinary = numberBinary.concat(String.valueOf(number % 2));
            }
            number /= 2;            
        }

        return numberBinary;
    } 

    

}
