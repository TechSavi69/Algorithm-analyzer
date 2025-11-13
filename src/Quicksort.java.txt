public class QuickSort {
    
    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }
    
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
    
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);
        
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap elements
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        // Swap pivot to correct position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        return i + 1;
    }
    
    public static void measurePerformance() {
        System.out.println("=== Quick Sort Performance Analysis ===");
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