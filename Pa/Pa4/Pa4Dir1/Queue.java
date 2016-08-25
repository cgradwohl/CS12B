// Queue.java
// Christopher S. Gradwohl
// cgradwoh
// pa4
// a very short description of what the program does

public class Queue implements QueueInterface {
    // private inner class Node
    private class Node {
       Object item;
       Node next;

       Node(Object x){
          item = x;
          next = null;
       }
    }

    // private helper variables
    private Node front;
    private Node back;
    private int size;

    // Queue constructor
    public Queue(){
       front = null;
       back = null;
       size = 0;
    }

    //   ADT operations ----------------------------------------------------------

    // isEmpty()
    // pre: none
    // post: returns true if this Queue is empty, false otherwise
    public boolean isEmpty() {
        return size == 0;
    }

    // length()
    // pre: none
    // post: returns the length of this Queue.
    public int length() {
        return size;
    }

    // enqueue()
    // adds newItem to back of this Queue
    // pre: none
    // post: !isEmpty()
    public void enqueue(Object newItem) {
        Node newNode = new Node(newItem);
        //case 1 empty queue
        if (isEmpty()) {
            front = newNode;
            back = front;
        }
        //case 2 non empty queue
        back.next = newNode;
        back = back.next;
        size++;
    }

    // dequeue()
    // deletes and returns item from front of this Queue
    // pre: !isEmpty()
    // post: this Queue will have one fewer element
    public Object dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue Error: cannot dequeue() an empty queue");
        }
        Object frontItem = peek();
        front = front.next;
        size--;
        return frontItem;
    }

    // peek()
    // pre: !isEmpty()
    // post: returns item at front of Queue
    public Object peek() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue Error: cannot peek() an empty queue");
        }
        return front.item;
    }

    // dequeueAll()
    // sets this Queue to the empty state
    // pre: !isEmpty()
    // post: isEmpty()
    public void dequeueAll() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException("Queue Error: cannot dequeueAll() an empty queue");
        }
        front = null;
        back = null;
        size = 0;
    }

    // toString()
    // overrides Object's toString() method
    public String toString(){
        String s = "";
        Node N = front;
        while(N != null){
            s = s+N.item.toString()+" ";
            N = N.next;
        }
        return s;
    }
}
