public class LinkedList {
    private Node head;
    private int numberOfNodes;

    public LinkedList() {
        head = null;
    }

    public LinkedList(int[] values) {
        head = new Node(values[0]);
        Node adding;
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            adding = new Node(values[i]);
            current.setNext(adding);
            current = current.getNext();
        }
    }

    public void display() {
        //display each element on the same line
        Node current = head;
        while (current != null) {
            System.out.println(current.getValue() + ",");

        }
    }

    public void addNode(int v) {
        Node toAdd = new Node(v);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(toAdd);
    }

    public int size() {
        Node current = head;
        current = head;
        int counter = 0;
        while (current != null) {
            current = current.getNext();
            counter++;
        }
        return counter;
    }

    public void clear() {

        head = null;
    }

    public void addFirst(int n) {
        Node addfirst = new Node(n);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(addfirst);
    }

    public int getFirst() {
        return head.getValue();
    }

    public int getLast() {
        Node current =head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
            return current.getValue();
        }
    // retrieves and removes the node at "index"
    public Node remove(int index){
       //walk list to post 2
       //remove from list
       //return node
        
    }
}










