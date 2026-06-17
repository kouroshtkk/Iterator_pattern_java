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

### 3. C#-Style Range Iterator (`Range` / `RangeIterator`)
Generates an ascending sequence of contiguous integers. Unlike standard Java iterators, this implementation uses a C#-style iterator pattern:
* `moveNext()`: Advances the iterator to the next element and returns a boolean indicating success.
* `current()`: Returns the element at the current position without advancing the iterator.
* Includes a utility method `prodOf()` that calculates the product of the sequence by manually traversing it using `moveNext()` and `current()`.

### 4. Custom Iterator Wrapper (`GetMyIterator`)
An adapter class that wraps a standard `java.util.Iterator<E>` and converts it to a custom `MyIterator<E>` interface.
* **Separation of Concerns**: Unlike the standard iterator, this custom interface separates the action of advancing (`advance()`) from retrieving the element (`element()`), allowing the current element to be queried multiple times without moving the cursor.

### 5. Smart Iterator for Arrays (`GetSmartIterator`)
An implementation of a custom `SmartIterator<E>` interface that allows iterating over an array of type `E[]`.
* **C#-style interaction**: Uses `moveNext()` to advance and `current()` to retrieve the element.
* **Robustness**: Handles `null` elements in the array and throws `NoSuchElementException` if `current()` is called before the first `moveNext()` or after iteration ends.

### 6. JavaScript-Style Iterator Adapter (`ToJSIterator`)
An adapter that converts a standard Java `Iterator<E>` into a JavaScript-style iterator.
* **Interface**: Uses a single `next()` method that returns a `JSIteratorResult` (a record containing `value` and `done`).
* **Immutability**: Uses Java `records` to implement the result object, ensuring immutability and clean data handling.

## How to Run
Compile and run the programs from the terminal:

```bash
cd src
javac *.java

# Run Factorial tests
java -ea Main

# Run Reverse Range tests
java -ea ReverseRangeUtil

# Run C#-style Range tests
java -ea RangeUtil
```

To run the custom wrapper, smart iterator, or JS-style iterator tests:
```bash
# Custom MyIterator wrapper
javac my_iterator/*.java
java -ea my_iterator.MyIteratorTest

# SmartIterator for arrays
javac smart_iterator/*.java
java -cp . smart_iterator.IteratorTest

# JS-style Iterator Adapter
javac js_iterator/*.java
java -cp . js_iterator.IteratorTest
```