public class ElonsToyCar {
    public int battery = 100;
    public int metersDrive = 0;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven ".concat(String.valueOf(metersDrive).concat(" meters"));
    }

    public String batteryDisplay() {
        if (battery == 0) return "Battery empty";
        return "Battery at ".concat(String.valueOf(battery).concat("%"));
    }

    public void drive() {
        if (battery != 0){
            battery -= 1;
            metersDrive += 20;
        } 
        
    }
}
