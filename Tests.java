public class Tests {
    public static void main(String[] args) {
        testMyArrayList();
        testMyLinkedList();
        testMyStack();
        testMyQueue();
        testMyMinHeap();
        
        System.out.println("All tests passed!");
    }
    
    private static void testMyArrayList() {
        System.out.println("Testing MyArrayList...");
        
        MyArrayList<Integer> list = new MyArrayList<>();
        
        // Test add
        list.add(10);
        list.add(20);
        list.add(30);
        assert list.size() == 3 : "Size should be 3";
        
        // Test add at index
        list.add(1, 15);
        assert list.get(1) == 15 : "Element at index 1 should be 15";
        
        // Test get
        assert list.get(0) == 10 : "First element should be 10";
        assert list.get(2) == 20 : "Third element should be 20";
        
        // Test remove
        list.remove(1);
        assert list.get(1) == 20 : "After remove, element at index 1 should be 20";
        assert list.size() == 3 : "Size should be 3 after remove";
        
        // Test exists
        assert list.exists(10) : "List should contain 10";
        assert !list.exists(15) : "List should not contain 15";
        
        // Test indexOf
        assert list.indexOf(20) == 1 : "Index of 20 should be 1";
        assert list.indexOf(100) == -1 : "Index of non-existent element should be -1";
        
        // Test clear
        list.clear();
        assert list.isEmpty() : "List should be empty after clear";
        
        // Test sort
        list.add(30);
        list.add(10);
        list.add(20);
        list.sort();
        assert list.get(0) == 10 : "After sort, first element should be 10";
        assert list.get(1) == 20 : "After sort, second element should be 20";
        assert list.get(2) == 30 : "After sort, third element should be 30";
        
        // Test iterator
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        assert sum == 60 : "Sum of all elements should be 60";
        
        System.out.println("MyArrayList tests passed!");
    }
    
    private static void testMyLinkedList() {
        System.out.println("Testing MyLinkedList...");
        
        MyLinkedList<String> list = new MyLinkedList<>();
        
        // Test add
        list.add("A");
        list.add("C");
        list.add("E");
        assert list.size() == 3 : "Size should be 3";
        
        // Test add at index
        list.add(1, "B");
        list.add(3, "D");
        assert list.get(1).equals("B") : "Element at index 1 should be B";
        assert list.get(3).equals("D") : "Element at index 3 should be D";
        
        // Test get
        assert list.get(0).equals("A") : "First element should be A";
        assert list.get(4).equals("E") : "Last element should be E";
        
        // Test remove
        list.remove(2);
        assert list.get(2).equals("D") : "After remove, element at index 2 should be D";
        assert list.size() == 4 : "Size should be 4 after remove";
        
        // Test exists
        assert list.exists("A") : "List should contain A";
        assert !list.exists("C") : "List should not contain C";
        
        // Test indexOf
        assert list.indexOf("D") == 2 : "Index of D should be 2";
        assert list.indexOf("X") == -1 : "Index of non-existent element should be -1";
        
        // Test clear
        list.clear();
        assert list.isEmpty() : "List should be empty after clear";
        
        // Test sort
        list.add("E");
        list.add("C");
        list.add("A");
        list.add("D");
        list.add("B");
        list.sort();
        assert list.get(0).equals("A") : "After sort, first element should be A";
        assert list.get(1).equals("B") : "After sort, second element should be B";
        assert list.get(4).equals("E") : "After sort, last element should be E";
        
        // Test iterator
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        assert sb.toString().equals("ABCDE") : "Iterator should traverse elements in order";
        
        System.out.println("MyLinkedList tests passed!");
    }
    
    private static void testMyStack() {
        System.out.println("Testing MyStack...");
        
        MyStack<Integer> stack = new MyStack<>();
        
        // Test isEmpty (when empty)
        assert stack.isEmpty() : "New stack should be empty";
        
        // Test push
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assert stack.size() == 3 : "Size should be 3 after pushing 3 elements";
        
        // Test peek
        assert stack.peek() == 30 : "Top element should be 30";
        assert stack.size() == 3 : "Size should still be 3 after peek";
        
        // Test pop
        assert stack.pop() == 30 : "Popped element should be 30";
        assert stack.pop() == 20 : "Popped element should be 20";
        assert stack.size() == 1 : "Size should be 1 after popping 2 elements";
        
        // Test clear
        stack.clear();
        assert stack.isEmpty() : "Stack should be empty after clear";
        
        System.out.println("MyStack tests passed!");
    }
    
    private static void testMyQueue() {
        System.out.println("Testing MyQueue...");
        
        MyQueue<String> queue = new MyQueue<>();
        
        // Test isEmpty (when empty)
        assert queue.isEmpty() : "New queue should be empty";
        
        // Test enqueue
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        assert queue.size() == 3 : "Size should be 3 after enqueueing 3 elements";
        
        // Test peek
        assert queue.peek().equals("A") : "Front element should be A";
        assert queue.size() == 3 : "Size should still be 3 after peek";
        
        // Test dequeue
        assert queue.dequeue().equals("A") : "Dequeued element should be A";
        assert queue.dequeue().equals("B") : "Dequeued element should be B";
        assert queue.size() == 1 : "Size should be 1 after dequeuing 2 elements";
        
        // Test clear
        queue.clear();
        assert queue.isEmpty() : "Queue should be empty after clear";
        
        System.out.println("MyQueue tests passed!");
    }
    
    private static void testMyMinHeap() {
        System.out.println("Testing MyMinHeap...");
        
        MyMinHeap<Integer> heap = new MyMinHeap<>();
        
        // Test isEmpty (when empty)
        assert heap.isEmpty() : "New heap should be empty";
        
        // Test insert
        heap.insert(5);
        heap.insert(3);
        heap.insert(7);
        heap.insert(1);
        heap.insert(9);
        assert heap.size() == 5 : "Size should be 5 after inserting 5 elements";
        
        // Test peek
        assert heap.peek() == 1 : "Min element should be 1";
        assert heap.size() == 5 : "Size should still be 5 after peek";
        
        // Test extractMin
        assert heap.extractMin() == 1 : "First extracted min should be 1";
        assert heap.extractMin() == 3 : "Second extracted min should be 3";
        assert heap.extractMin() == 5 : "Third extracted min should be 5";
        assert heap.size() == 2 : "Size should be 2 after extracting 3 elements";
        
        // Test clear
        heap.clear();
        assert heap.isEmpty() : "Heap should be empty after clear";
        
        System.out.println("MyMinHeap tests passed!");
    }
}

