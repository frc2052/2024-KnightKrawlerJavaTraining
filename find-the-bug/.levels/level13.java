// this class calculates averages of values

public class level13 {
    public static void main(String[] args) {
        double[] values = {1.5, 2.0, 3.5, 4.0};
        double average = calculateAverage(values);
        System.out.println("The average is: " + average);
    }

    public static double calculateAverage(double[] values) {
        double sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }
}
