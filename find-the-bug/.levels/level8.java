// Fix this time checker so that when it is at 12 and beyond it is the afternoon

public class level8 {
    public static void main(String...args){
        boolean afternoon = false;
        int time = 0;
        while(time <= 24){
            // increase time by 1 each cycle
            time++;

            // check if it is past 12 and if so set it as the afternoon
            if (time >= 12){
               afternoon = true;
            }

            System.out.println("Current time: " + time + " - Is Afternoon: " + afternoon);
        }
    }
}
