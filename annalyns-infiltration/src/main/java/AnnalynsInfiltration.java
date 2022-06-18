public class AnnalynsInfiltration {
    static public boolean canFastAttack(boolean knightIsAwake) {
        if (knightIsAwake == true){
            return false;
        } else {
            return true;
        } 
        
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if (knightIsAwake == true){
            return true;
        } else if (archerIsAwake == true){
            return true;
        } else if (prisonerIsAwake == true){
            return true;
        } else {
            return false;
        }

        
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if (archerIsAwake == false && prisonerIsAwake == true){
            return true;
        } 
        return false;
        
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if (petDogIsPresent == true && knightIsAwake == true && archerIsAwake == false){
            return true;
        }
        if (petDogIsPresent == false && knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == true){
            return true;
        }

        if (petDogIsPresent == true && knightIsAwake == false && archerIsAwake == false){
            return true;
        }
        
        return false;    
    }
}
