# Java Iterator Pattern Exercises

This repository contains my solutions to university exam exercises focused on implementing custom iterators in Java.
The programs implement the `Iterable` and `Iterator` interfaces to lazily evaluate and generate sequences without storing them in memory.

## Exercises

### 1. Factorial Sequence (`FactIterable` / `FactIterator`)
Generates a sequence of factorial numbers (1!, 2!, 3!, ..., n!).
* **Constant Time Complexity**: The `next()` method computes the subsequent factorial in O(1) time by maintaining the state of the previous factorial instead of recalculating it from scratch.

### 2. Reverse Range Sequence (`ReverseRange` / `ReverseRangeIterator`)
Generates a descending sequence of contiguous integers from a starting value (inclusive) down to an ending value (exclusive).
* Includes a utility method `sumSquaresOf()` that demonstrates consuming the `Iterable` in a standard for-each loop to calculate the sum of the squares of the sequence elements.

## How to Run
Compile and run the programs from the terminal:

```bash
cd src
javac *.java

# Run Factorial tests
java -ea Main

# Run Reverse Range tests
java -ea ReverseRangeUtil
```