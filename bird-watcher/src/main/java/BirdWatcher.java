class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if (birdsPerDay.length == 0){
            return 0;
        }
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] == 0) return true; 
        }
        
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sumBirds = 0;
        if (numberOfDays > birdsPerDay.length) numberOfDays = birdsPerDay.length;

        for (int i = 0; i < numberOfDays; i++) {
            sumBirds = sumBirds + birdsPerDay[i];
        }

        return sumBirds;
    }

    public int getBusyDays() {
        int sumBusyDays = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) sumBusyDays++;
        }

        return sumBusyDays;
    }
}
