
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
       return new int[] {0,2,5,3,7,8,4};
    }

    public int getToday() {
       return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
       birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i]==0){
            return true;
                }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if(numberOfDays>=7){
            numberOfDays =7;
        }
        int result =0;
        for(int i=0;i<numberOfDays;i++){
            result = result +birdsPerDay[i];
        }
        return result;
    }

    public int getBusyDays() {
        int count =0;
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i]>=5){
                count++;
            }
        }
        return count;
    }
}