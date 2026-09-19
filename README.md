# HomeWork-2-Sorting-Searching

Name: Shah Rayan

Programming Language: Java

IDE / Editor: IntelliJ IDEA

Original Array:
23 44 30 65 42 22 43 77 89 67 40 91

### Question 1

The worst-case Big O time complexity of Bubble Sort is O(n²).

### Question 2

Bubble Sort has O(n²) time complexity because the outer loop goes through the array multiple times while the inner loop compares adjacent elements during every pass. Which produces n x n or O(n²) time complexity.

### Question 3

With 10 elements, Bubble Sort would produce 10x10 or 100 comparisons. With 1,000 elements, the number of comparisons becomes 1000x1000 or 1000000 because O(n²) is exponential and  grows very quickly, so it would require roughly ( 1000000 / 100 ) or 10,000 times as many comparisons compared to 10 elements.

### Question 4

The Big O time complexity of Merge Sort is O(n log n).

### Question 5

Merge Sort generally works better when there is a lot of data because it divides the array into smaller parts and sorts them. It has an O(n log n) time complexity, while Bubble Sort has O(n²), so Bubble Sort takes many more comparisons compared to Merge Sort in terms of processing larger amounts of data.

### Question 6

**Bubble Sort = O(n²)**
**Merge Sort = O(n log n)**

### Question 7

Linear Search has a Big O time complexity of **O(n)**. In the worst case, it loops through every element in the array.

### Question 8

Binary Search has a Big O time complexity of **O(log n)**. It is faster because it finds the midpoint of a sorted array and disregards half of the remaining elements with each step.

### Question 9

Binary Search requires sorted data because it uses the middle value to decide which half of the array to search. Without sorted data, it would not know which half to eliminate.

### Question 10

I would use Linear Search if the data were not sorted. Linear Search is ideal as it loops through every element of the array and doesn't require the array to be sorted.

### Question 11

I would use **Binary Search** for a very large sorted array. It is more efficient because it has a O(log n) time complexity compared to Linear Search which has a O(n) time complexity.

## Part 12 — Algorithm Comparison Table

| Algorithm     | Purpose   | Big O      |
| ------------- | --------- | ---------- |
| Bubble Sort   | Sorting   | O(n²)      |
| Merge Sort    | Sorting   | O(n log n) |
| Linear Search | Searching | O(n)       |
| Binary Search | Searching | O(log n)   |
