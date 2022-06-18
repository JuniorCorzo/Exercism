public class DoublyLinkedList<T> {
    Node head;
    int length;

    class Node {
        Node next;
        Node prev;
        T data;

        Node(T data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.length = 0;

    }

    public void unshift(T data) {
        Node newNode = new Node(data);

        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            this.head.prev = newNode;
        }

        head = newNode;
        this.length++;
    }

    public T shift() {
        T data = head.data;
        if (this.head.next != null){
            this.head = this.head.next;
        }

        if (this.head.prev != null){
            this.head.prev = null;
        }
        return data;
    }

    public T pop() {
        while (this.head.next != null) {
            this.head = this.head.next;
        }
        T data = this.head.data;

        if (this.head.prev != null){
            this.head = this.head.prev;
        }

        if (this.head.next != null) {
            this.head.next = null;
        }
        return data;
    }

    public void push(T data) {
        Node newNode = new Node(data);
        Node last = head;

        newNode.next = null;
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;

    }

}