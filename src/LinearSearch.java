public class LinearSearch {
    
    public static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }
    
    public static void measurePerformance() {
        System.out.println("=== Linear Search Performance Analysis ===");
        System.out.println("| Input Size | Time (ms) |");
        System.out.println("|------------|-----------|");
        
        int[] sizes = {100, 500, 1000};
        
        for (int size : sizes) {
            // Generate random array
            int[] array = ArrayGenerator.generateRandomArray(size);
            int target = array[array.length / 2]; // Search for middle element
            
            // Measure time
            long startTime = System.nanoTime();
            search(array, target);
            long endTime = System.nanoTime();
            
            double timeMs = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds
            
            System.out.printf("| %-10d | %-9.3f |\n", size, timeMs);
        }
    }
}