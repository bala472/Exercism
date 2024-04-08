class NeedForSpeed {
    int speed;
    int battery=100;
    int batteryDrain;
    int distance;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        if(battery<=0)
            return true;
        return false;
    }

    public int distanceDriven() {
        return distance;
    }
    public void drive() {
        if(distance <18 ){
            distance = distance+speed;
        }
        battery= battery-batteryDrain;
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
    }
}

class RaceTrack {
    int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        if((100 - (((double)distance/car.speed)*car.batteryDrain))>=0)
            return true;
        return false;
    }
}
