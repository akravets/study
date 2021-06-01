import java.util.LinkedList;
import java.util.List;

public class LinkedListInsert {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        LinkedListInsert list = new LinkedListInsert();
        list.add(5);
        list.add(3);
        list.add(4);

    }

    private void add(int data){
        Node node = new Node(data);

        if(head == null || head.data >= node.data){
            node.next = head;
            head = node;
        }
        else{
            Node current = head;
            while (current.next != null && current.data < node.data) {
                current = current.next;
                node.next = current.next;
                current.next = node;
            }
        }
    }
}
