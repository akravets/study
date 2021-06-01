public class Tree {
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node4 = new Node(4);
        Node node1 = new Node(1);
        Node node3 = new Node(3);
        Node node0 = new Node(0);
        Node node6 = new Node(6);


        root.setLeft(node2);
        root.setRight(node4);

        node2.setLeft(node1);
        node2.setRight(node3);

        node4.setLeft(node0);
        node4.setRight(node6);

        System.out.println(sumTree(root));
    }

    private static int sumTree(Node node){
        if(node == null){
            return 0;
        }

        int value = node.getValue();
        int left = sumTree(node.getLeft());
        int right = sumTree(node.getRight());

        System.out.println("value: " + value + ", left: " + left + ", right: " + right);

        return value + left + right;
    }
}
