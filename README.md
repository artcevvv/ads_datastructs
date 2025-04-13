# Data Structures Assignment

This assignment implements several fundamental data structures in Java, providing a hands-on understanding of their implementation and functionality.

## Project Structure

The project consists of the following components:

1. **Core Interfaces**
   - `MyList<T>`: A generic interface defining the basic operations for list-like data structures

2. **List Implementations**
   - `MyArrayList<T>`: A dynamic array implementation of the MyList interface
   - `MyLinkedList<T>`: A doubly-linked list implementation of the MyList interface

3. **Queue and Stack**
   - `MyQueue<T>`: A queue implementation
   - `MyStack<T>`: A stack implementation

4. **Heap**
   - `MyMinHeap<T>`: A min-heap implementation

5. **Testing**
   - `Tests.java`: Contains test cases for all implemented data structures

## Data Structure Implementations

### MyList Interface
The `MyList` interface defines the following operations:
- Basic operations: `add`, `set`, `get`, `remove`
- Position-specific operations: `addFirst`, `addLast`, `getFirst`, `getLast`, `removeFirst`, `removeLast`
- Utility operations: `sort`, `indexOf`, `lastIndexOf`, `exists`, `toArray`, `clear`, `size`

### MyArrayList
- Implements a dynamic array
- Automatically resizes when capacity is reached
- Provides O(1) access time for get/set operations
- O(n) time for insertions and deletions

### MyLinkedList
- Implements a doubly-linked list
- Provides O(1) time for insertions and deletions at the ends
- O(n) time for access and middle insertions/deletions

### MyQueue
- Implements a First-In-First-Out (FIFO) data structure
- Supports basic queue operations: enqueue and dequeue

### MyStack
- Implements a Last-In-First-Out (LIFO) data structure
- Supports basic stack operations: push and pop

### MyMinHeap
- Implements a binary min-heap
- Supports efficient insertion and extraction of minimum elements
- Maintains the heap property for efficient operations

## Testing
The `Tests.java` file contains comprehensive test cases for all implemented data structures, ensuring their correctness and proper functionality.

## Usage
To use any of these data structures, simply import the desired class and create an instance:

```java
// Example usage of MyArrayList
MyList<Integer> list = new MyArrayList<>();
list.add(1);
list.add(2);
list.add(3);

// Example usage of MyQueue
MyQueue<String> queue = new MyQueue<>();
queue.enqueue("first");
queue.enqueue("second");
String first = queue.dequeue();

// Example usage of MyMinHeap
MyMinHeap<Integer> heap = new MyMinHeap<>();
heap.insert(5);
heap.insert(3);
heap.insert(7);
int min = heap.extractMin(); // Returns 3
```

## Notes
- All implementations are generic and can work with any object type
- The implementations focus on educational purposes and may not be optimized for production use
- Each data structure maintains its specific time and space complexity characteristics
