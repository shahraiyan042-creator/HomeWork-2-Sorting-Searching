# HomeWork-2-Sorting-Searching

Name: Shah Rayan

Programming Language: Java

IDE / Editor: IntelliJ IDEA

Original Array:
23 44 30 65 42 22 43 77 89 67 40 91

### Question 1

The worst-case Big O time complexity of Bubble Sort is **O(n²)**.

### Question 2

Bubble Sort has this time complexity because it has to repeatedly compare numbers next to each other. The nested loops cause the program to make many comparisons as the size of the array gets bigger.

### Question 3

With 10 elements, Bubble Sort would only need a relatively small number of comparisons. With 1,000 elements, the number of comparisons becomes much larger because O(n²) grows very quickly, so it would require roughly 10,000 times as many comparisons.

### Question 4

The Big O time complexity of Merge Sort is **O(n log n)**.

### Question 5

Merge Sort generally works better when there is a lot of data because it divides the array into smaller parts and sorts them. It has an **O(n log n)** time complexity, while Bubble Sort has **O(n²)**, so Bubble Sort takes many more comparisons as the amount of data increases.

### Question 6

**Bubble Sort = O(n²)**
**Merge Sort = O(n log n)**

### Question 7

Linear Search has a Big O time complexity of **O(n)**. In the worst case, it may have to check every element in the array.

### Question 8

Binary Search has a Big O time complexity of **O(log n)**. It is faster because it eliminates half of the remaining elements after each comparison.

### Question 9

Binary Search requires sorted data because it uses the middle value to decide which half of the array to search. Without sorted data, it would not know which half to eliminate.

### Question 10

I would use **Linear Search** if the data were not sorted. Linear Search can search through an unsorted array without needing to sort it first.

### Question 11

I would use **Binary Search** for a very large sorted array. It is more efficient because it eliminates half of the remaining data each time, giving it an **O(log n)** time complexity.

## Part 12 — Algorithm Comparison Table

| Algorithm     | Purpose   | Big O      |
| ------------- | --------- | ---------- |
| Bubble Sort   | Sorting   | O(n²)      |
| Merge Sort    | Sorting   | O(n log n) |
| Linear Search | Searching | O(n)       |
| Binary Search | Searching | O(log n)   |
