# Algorithm Analyzer – Algorithm Performance Measurement Tool

A small Java project for the Data Structures & Algorithms course (CIT300 practical assignment). This repository contains a console-based algorithm performance analyzer that demonstrates algorithm efficiency, time measurement, and complexity analysis across search and sort algorithms. The code is intentionally compact for learning, demonstration, and extension.

## Table of Contents
- Project Overview
- Features
- Tech Stack
- Project Structure
- How to Compile & Run 
- Members
- Notes & Next Steps

## Project Overview
This project implements Linear Search, Binary Search, Bubble Sort, and Quick Sort to compare their performance on various input sizes. It allows users to test individual algorithms or run comprehensive performance comparisons across different dataset sizes (100, 500, 1000 elements).

It is written in plain Java and requires a JDK to compile and run.

## Features
✅ Individual algorithm performance testing  
✅ Implementation of Linear Search, Binary Search, Bubble Sort, and Quick Sort  
✅ Execution time measurement using `System.nanoTime()`  
✅ Performance comparison across different input sizes  
✅ Menu-driven, user-friendly console interface  
✅ Random data generation for consistent testing  
✅ Results displayed in clean table format  

## Tech Stack
- **Java** (JDK 8+ recommended)
- No external libraries required
- Works on any standard console environment

## Project Structure
Top-level files and purpose:

| File | Description |
|------|-------------|
| `README.md` | This file |
| `src/Main.java` | Main entry point; handles menu and user interface |
| `src/LinearSearch.java` | Implements Linear Search with performance measurement |
| `src/BinarySearch.java` | Implements Binary Search with performance measurement |
| `src/BubbleSort.java` | Implements Bubble Sort with performance measurement |
| `src/QuickSort.java` | Implements Quick Sort with performance measurement |
| `src/ArrayGenerator.java` | Handles random data generation and utility methods |

All source files are inside the `src` folder (default package).

## How to Compile & Run (Windows PowerShell)
Open PowerShell and run the following commands from the project root (where this README.md sits):

```powershell
# Change to the project directory
cd "E:\CIT300\algorithm-analyzer"

# Create an output directory for compiled classes
if (-not (Test-Path -Path .\bin)) { New-Item -ItemType Directory -Path .\bin | Out-Null }

# Compile all Java sources into the bin folder
javac -d bin src\*.java

# Run the program
java -cp bin Main
```

**Notes:**
- Ensure you have a JDK installed and accessible via your system PATH.
- Check using `javac -version` and `java -version`.
- If using an IDE (Eclipse/IntelliJ), import it as a plain Java project and run the `Main` class.

### Example Menu
```
🚀 Algorithm Performance Analyzer
=================================

--- Available Algorithms ---
1. Linear Search
2. Binary Search
3. Bubble Sort
4. Quick Sort
5. Run All Algorithms
6. Exit

Choose an option (1-6):
```

### Example Output
```
=== Linear Search Performance Analysis ===
| Input Size | Time (ms) |
|------------|-----------|
| 100        | 0.015     |
| 500        | 0.078     |
| 1000       | 0.152     |
```

## Members

| Member | Task |
|--------|------|
| Member 01 | Implement Linear Search — measure time for finding an element in arrays of sizes 100, 500, and 1000 |
| Member 02 | Implement Binary Search — sort the array first, then measure search time for the same input sizes 100, 500 and 1000 |
| Member 03 | Implement Bubble Sort — measure sorting time for input sizes 100, 500, and 1000 |
| Member 04 | Implement Quick Sort — measure sorting time for input sizes 100, 500, and 1000 |

## Notes & Next Steps
This README focuses on getting started quickly. Suggested improvements:

- Add graphical performance charts (optional for advanced users)
- Include unit tests for algorithm functions
- Add input/output file support for test data
- Provide Javadoc comments and generate API docs
- Extend with additional algorithms (Insertion Sort, Heap Sort, etc.)
- Implement memory usage tracking alongside time complexity

📅 **Course**: CIT300 - Data Structures and Algorithms  
📅 **Assignment**: Graded Practical Assignment 3  
📅 ** Updated On**: 2025 - 11 - 16  

