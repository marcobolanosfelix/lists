import simple_linked_list.SimpleLinkedList;

public class ListApplication {

    public static void main(String[] args) {
        
        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
        simpleLinkedList.addNode(8);
        simpleLinkedList.addNode(5);
        simpleLinkedList.addNode(6);
        simpleLinkedList.addNode(3);
        simpleLinkedList.showList();
        simpleLinkedList.deleteNode(5);
        simpleLinkedList.showList();
        simpleLinkedList.searchNode(6);
        simpleLinkedList.showList();
        simpleLinkedList.updateNode(3, 14);
        simpleLinkedList.showList();

    }

}
