public class level7 {

    boolean isDriving;

    // pretend this is a speed sensor on a wheel and a sensor for if the engine is on
    int fakeWheelSpeedSensor = 0;
    boolean fakeEngineOn = false;

    public level7(){

    }

    public static void main(String...args){

    }

    private checkIfDriving(int wheelSpeed, boolean engineOn){
        if (wheelSpeed > 0 && engineOn){
            isDriving = true;
        }
    }
}
