import java.util.NoSuchElementException;

public class MyMinHeap<T extends Comparable<T>> {
    private final MyArrayList<T> heap;

    public MyMinHeap() {
        heap = new MyArrayList<>();
    }

    public void insert(T element) {
        if (element == null) {
            throw new NullPointerException("Cannot insert null element");
        }

        heap.add(element);

        int currentIndex = heap.size() - 1;
        bubbleUp(currentIndex);
    }

    public T extractMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }

        T min = heap.get(0);

        T lastElement = heap.get(heap.size() - 1);
        heap.remove(heap.size() - 1);

        if (!isEmpty()) {
            heap.set(0, lastElement);
            bubbleDown(0);
        }

        return min;
    }

    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Heap is empty");
        }
        return heap.get(0);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    public void clear() {
        heap.clear();
    }

    private void bubbleUp(int index) {
        if (index <= 0) {
            return;
        }

        int parentIndex = (index - 1) / 2;
        T current = heap.get(index);
        T parent = heap.get(parentIndex);

        if (current.compareTo(parent) < 0) {
            heap.set(parentIndex, current);
            heap.set(index, parent);

            bubbleUp(parentIndex);
        }
    }

    private void bubbleDown(int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        int smallest = index;

        if (leftChildIndex < heap.size() && heap.get(leftChildIndex).compareTo(heap.get(smallest)) < 0) {
            smallest = leftChildIndex;
        }

        if (rightChildIndex < heap.size() && heap.get(rightChildIndex).compareTo(heap.get(smallest)) < 0) {
            smallest = rightChildIndex;
        }

        if (smallest != index) {
            T current = heap.get(index);
            T smallestChild = heap.get(smallest);

            heap.set(index, smallestChild);
            heap.set(smallest, current);

            bubbleDown(smallest);
        }
    }
}
