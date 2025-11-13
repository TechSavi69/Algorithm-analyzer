import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("🚀 Algorithm Performance Analyzer");
        System.out.println("=================================");
        
        while (true) {
            System.out.println("\n--- Available Algorithms ---");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Bubble Sort");
            System.out.println("4. Quick Sort");
            System.out.println("5. Run All Algorithms");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    LinearSearch.measurePerformance();
                    break;
                case 2:
                    BinarySearch.measurePerformance();
                    break;
                case 3:
                    BubbleSort.measurePerformance();
                    break;
                case 4:
                    QuickSort.measurePerformance();
                    break;
                case 5:
                    runAllAlgorithms();
                    break;
                case 6:
                    System.out.println("Thank you for using Algorithm Analyzer!");
                    return;
                default:
                    System.out.println("Invalid choice! Please enter 1-6.");
            }
        }
    }
    
    public static void runAllAlgorithms() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("COMPREHENSIVE ALGORITHM PERFORMANCE ANALYSIS");
        System.out.println("=".repeat(50));
        
        LinearSearch.measurePerformance();
        System.out.println();
        BinarySearch.measurePerformance();
        System.out.println();
        BubbleSort.measurePerformance();
        System.out.println();
        QuickSort.measurePerformance();
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ANALYSIS COMPLETE!");
        System.out.println("=".repeat(50));
    }
}