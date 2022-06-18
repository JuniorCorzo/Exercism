class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    public int speed;
    public int meterDistance;
    public int numberofVictories;

    public ProductionRemoteControlCar(){
        this.speed = 10;
        this.meterDistance = 0;
        this.numberofVictories = 0;
    }

    public void drive() {
        this.meterDistance += speed;
    }

    public int getDistanceTravelled() {
        return meterDistance;
    }

    public int getNumberOfVictories() {
        return numberofVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberofVictories = numberofVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar prc) {
        if (this.numberofVictories > prc.numberofVictories){
            return 1;
        }
        return 2;
    }
}
