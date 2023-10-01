public class level7 {

    public static void main(String...args){

        // pretend this is a speed sensor on a wheel and a sensor for if the engine is on
        double fakeWheelSpeedSensor = 0;
        boolean fakeEngineSensor = false;

        if (checkIfDriving(fakeWheelSpeedSensor, fakeEngineSensor)){
            System.out.println("DRIVING");
        } else  {
            System.out.println("NOT DRIVING");
        }
    }

    public static checkIfDriving(double wheelSpeed, boolean isEngineOn){
        if (wheelSpeed > 0 && isEngineOn){
            return true;
        } else {
            return false;
        }
    }
}
