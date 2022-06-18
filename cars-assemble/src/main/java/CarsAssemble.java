public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        final double speedForProductionNormal = 221;
        
        if (speed >= 1 && speed <= 4){
            return speed * speedForProductionNormal;
        }

        if (speed >= 5 && speed <= 8){
            return speed * speedForProductionNormal * 0.9;
        }

        if (speed == 9){
            return speed * speedForProductionNormal * 0.8;
        }
        
        if (speed == 10){
            return speed * speedForProductionNormal * 0.77;
        }

        return 0.0; 
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
