public class BinarySearch {
    
    public static int search(int[] sortedArray, int target) {
        int left = 0;
        int right = sortedArray.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (sortedArray[mid] == target) {
                return mid; // Found at mid index
            }
            
            if (sortedArray[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Not found
    }
    
    public static void measurePerformance() {
        System.out.println("=== Binary Search Performance Analysis ===");
        System.out.println("| Input Size | Time (ms) |");
        System.out.println("|------------|-----------|");
        
        int[] sizes = {100, 500, 1000};
        
        for (int size : sizes) {
            // Generate sorted array (required for binary search)
            int[] sortedArray = ArrayGenerator.generateSortedArray(size);
            int target = sortedArray[sortedArray.length / 2]; // Search for middle element
            
            // Measure time
            long startTime = System.nanoTime();
            int result = search(sortedArray, target);
            long endTime = System.nanoTime();
            
            double timeMs = (endTime - startTime) / 1_000_000.0;
            
            System.out.printf("| %-10d | %-9.3f |\n", size, timeMs);
        }
    }
}