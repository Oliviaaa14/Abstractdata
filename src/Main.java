public class Main {

    public static void main(String[] args) {
        System.out.println("Linked List");
        Node myNode = new Node(13);
        myNode.display();
        int[] data = {13,7,19,68,0};
        LinkedList myList = new LinkedList(data);
        myList.display();
        myList.addNode(99);
        myList.display();
    }
}
