import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Robot {
    private static Set<String> namesRobot = new HashSet<>();

    public Robot() {
     
    }

    public String getName() {
        Random nameRandom = new Random();
        String nameRobot = "";
        boolean stop = false;
        while (!stop) {
            for (int i = 0; i < 5; i++) {
                if (i < 2) {
                    char letterRandom = (char) nameRandom.nextInt(65, 90);
                    nameRobot = nameRobot.concat(String.valueOf(letterRandom));
                } else {
                    int numRandom = nameRandom.nextInt(0, 9);
                    nameRobot = nameRobot.concat(String.valueOf(numRandom));
                }
            }
            if (namesRobot.add(nameRobot)){
                stop = true;
            } else {
                nameRobot = "";
            }

        }

        return nameRobot;
    }

    public String reset() {
        return "";
    }
}
