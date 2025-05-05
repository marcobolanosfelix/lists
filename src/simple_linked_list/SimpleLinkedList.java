package simple_linked_list;

public class SimpleLinkedList<T> {
    private Node<T> head;

    public SimpleLinkedList() {
        this.head = null;
    }
    
    public void addNode(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            System.out.println("Node " + data + " added at head.");
            return;
        }
        Node<T> currentNode = head;
        while (currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(newNode);
        System.out.println("Node " + data + " added at the end.");
    }

    public void showList() {
        Node<T> currentNode = head;
        if (currentNode == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.print("Linked list: ");
        while (currentNode != null) {
            System.out.print(currentNode.getData() + " -> ");
            currentNode = currentNode.getNextNode();
        }
    }

}
