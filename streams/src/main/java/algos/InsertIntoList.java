package algos;

public class InsertIntoList {
    static Node head = null;

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static void addNode(int data){
        Node node = new Node(data);

        if(head == null || head.data >= node.data) {
            node.next = head;
            head = node;
            return;
        }

        Node current = head;

        while(current.next != null && current.next.data < node.data){
            current = current.next;
            node.next = current.next;
            current.next = node;
        }
    }

    public static void main(String[] args) {
        InsertIntoList list = new InsertIntoList();
        list.addNode(5);
        list.addNode(3);
        list.addNode(10);
        list.addNode(1);
        list.addNode(12);

        System.out.println(list);
    }
}
