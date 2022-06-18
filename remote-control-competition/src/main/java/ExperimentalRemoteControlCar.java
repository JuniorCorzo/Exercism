public class ExperimentalRemoteControlCar implements RemoteControlCar {
    public int speed;
    public int meterDistance;

    public ExperimentalRemoteControlCar(){
        this.speed = 20;
        this.meterDistance = 0;
    }
    public void drive() {
        this.meterDistance += speed;
    }

    public int getDistanceTravelled() {
        return meterDistance;
    }

   
}
