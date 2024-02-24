class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake||archerIsAwake||prisonerIsAwake){
            return true;}
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(archerIsAwake==false&&prisonerIsAwake==true)
            return true;
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent){
            if(archerIsAwake==false){
                return true;
                }else{
                return false;
                }
        }else{
            if(knightIsAwake==false&&archerIsAwake==false&&prisonerIsAwake==true)
            return true;
            return false;
        }
}
}