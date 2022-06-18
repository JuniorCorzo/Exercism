class NeedForSpeed {
    
    public int speed;
    public int batteryDrain;
    public int metersDriven;
    public int battery;

    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.metersDriven = 0;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        return battery == 0;
    }

    public int distanceDriven() {
        return metersDriven;
    }

    public void drive() {
        if (this.battery != 0){
            this.metersDriven += speed;    
            this.battery -= batteryDrain;
        }
        
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    public int distance;
    
    public RaceTrack(int distance){
        this.distance = distance;
    }
   
    public boolean carCanFinish(NeedForSpeed car) {
        while (car.metersDriven <= 16){
            if (car.battery == 0) break;
            car.drive();
        }

        return car.battery != 0;
    }
}
