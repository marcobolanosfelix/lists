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

    public void deleteNode(T data) {
        if (head == null) {
            System.out.println("The list is empty, you cannot eliminate.");
            return;
        }

        if (head.getData() == data) {
            head = head.getNextNode();
            System.out.println("Node with data " + data + " eliminated at the head.");
            return;
        }

        Node<T> current = head;
        Node<T> previous = null;
        while (current != null && current.getData() != data) {
            previous = current;
            current = current.getNextNode();
        }

        if (current == null) {
            System.out.println("The node with data " + data + " was not found.");
            return;
        }

        previous.setNextNode(current.getNextNode());
        System.out.println("Node with data " + data + " eliminated.");
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
        System.out.println();
    }

    public boolean searchNode(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.getData() == data) {
                System.out.println("The node with data " + data + " exists in the list.");
                return true;
            }
            current = current.getNextNode();
        }
        System.out.println("The node with data " + data + " does not exist in the list.");
        return false;
    }

}
