import java.util.ArrayList;
import java.util.List;

public class TestTrack {

    public static void race(RemoteControlCar car) {
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1, ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> resultPrc = new ArrayList<>();       
        
        if (prc1.compareTo(prc2) == 1){
            resultPrc.add(prc2);
            resultPrc.add(prc1);
        }

        if (prc1.compareTo(prc2) == 2){
            resultPrc.add(prc1);
            resultPrc.add(prc2);
        }

        return resultPrc;
    }
}
