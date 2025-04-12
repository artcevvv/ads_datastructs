import java.util.EmptyStackException;

public class MyStack<T> {
    private final MyLinkedList<T> list;

    public MyStack() {
        list = new MyLinkedList<>();
    }

    public void push(T element) {
        list.addFirst(element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T element = list.getFirst();
        list.removeFirst();
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }
}
