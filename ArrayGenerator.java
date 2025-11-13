import java.util.Random;

public class ArrayGenerator {
    private static Random random = new Random();
    
    // Generate random array of given size
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); // Numbers between 0-999
        }
        return array;
    }
    
    // Generate sorted array for binary search testing
    public static int[] generateSortedArray(int size) {
        int[] array = generateRandomArray(size);
        java.util.Arrays.sort(array); // Use built-in sort for preparation
        return array;
    }
    
    // Display array (for debugging)
    public static void displayArray(int[] array) {
        if (array.length > 20) {
            System.out.println("Array size: " + array.length);
        } else {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}