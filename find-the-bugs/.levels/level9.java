public class level9 {
    public static void main(String...args){
        int code = 0;
        String ledMode = "NONE";

        switch(code){
            case 1
                ledMode = CONE;
            case 2:
                ledMode = CUBE;
            case 3
                ledMode = RED_DISABLED;
            case 4:
                ledMode = BLUE_DISABLED;
            default:
                ledMode = NONE;
        }

        System.out.println(ledMode);
    }
}
