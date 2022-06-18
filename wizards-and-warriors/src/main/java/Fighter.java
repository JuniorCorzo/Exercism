abstract class Fighter {

    boolean isVulnerable() {
        throw new UnsupportedOperationException("Please provide implementation for this method");
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        if (wizard.isVulnerable()){
            return 10;
        }
        return 6;
    }

    @Override
    boolean isVulnerable(){
        return false;
    }
    
}

class Wizard extends Fighter {
    public boolean isPrepareSpell;

    public Wizard(){
        this.isPrepareSpell = false;
    }

    @Override
    boolean isVulnerable() {
        if (this.isPrepareSpell){
            return false;
        }
        return true;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if (this.isPrepareSpell){
            return 12;
        }
        return 3;
    }

    void prepareSpell() {
        this.isPrepareSpell = true;
    }

}
