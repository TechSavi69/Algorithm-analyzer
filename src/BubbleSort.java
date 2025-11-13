public class BubbleSort {
    
    public static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public static void measurePerformance() {
        System.out.println("=== Bubble Sort Performance Analysis ===");
        System.out.println("| Input Size | Time (ms) |");
        System.out.println("|------------|-----------|");
        
        int[] sizes = {100, 500, 1000};
        
        for (int size : sizes) {
            // Generate random array
            int[] array = ArrayGenerator.generateRandomArray(size);
            int[] arrayCopy = array.clone(); // Work on copy
            
            // Measure time
            long startTime = System.nanoTime();
            sort(arrayCopy);
            long endTime = System.nanoTime();
            
            double timeMs = (endTime - startTime) / 1_000_000.0;
            
            System.out.printf("| %-10d | %-9.3f |\n", size, timeMs);
        }
    }
}