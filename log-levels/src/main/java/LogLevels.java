import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LogLevels {
    
    public static String message(String logLine) {
        String result = "";
        
        String[] arrayLogLine = logLine.split(" ");
        List<String> listLogLine = new ArrayList<>(Arrays.asList(arrayLogLine));
        for (int i = 1; i < listLogLine.size(); i++) {
            if (i < listLogLine.size() - 1 && !listLogLine.get(i).equals("")){
                result = result.concat((listLogLine.get(i).replaceAll("[^a-zA-Z]", "").concat(" ")));
            } else {
                result = result.concat(listLogLine.get(i));
                
            } 
            
        }
        return result.trim();    
    }

    public static String logLevel(String logLine) {
        String[] arrayLogLevel = logLine.split(" ");
        return arrayLogLevel[0].replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine).concat(" (").concat(logLevel(logLine)).concat(")");
    
    }
}
