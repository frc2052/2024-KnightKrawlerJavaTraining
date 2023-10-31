// this jclass finds what the max element of an array is

public class level15 {
    public static void main(String[] args) {
        int arr[] = {4, 7, 2, 9, 1, 16, 600};
        int max = findMaxElement(arr);
        System.out.println("The maximum element in the array is: " + max);
    }

    public static int findMaxElement(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
