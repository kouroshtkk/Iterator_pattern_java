# Java Iterator Pattern - Factorial Sequence

This repository contains my solution to a university exam exercise focused on implementing custom iterators in Java.

The program implements the `Iterable` and `Iterator` interfaces to lazily evaluate and generate a sequence of factorial numbers (1!, 2!, 3!, ..., n!).

## Features
* **Constant Time Complexity**: The `next()` method computes the subsequent factorial in O(1) time by maintaining the state of the previous factorial instead of recalculating it from scratch.
* **Custom Iterators**: Implements `java.util.Iterator` (`FactIterator`) and `java.lang.Iterable` (`FactIterable`).

## How to Run
Compile and run the program from the terminal:

```bash
cd src
javac *.java
java Main
```