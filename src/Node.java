
public class Node {
    private Node left = null;
    private Node right = null;

    private Integer value;

    Node() {}

    Node(Integer v) {
        this.add(v);
    }

    public void add(Integer v) {
        this.value = v;
    }

    public Integer getValue() {
        return value;
    }

    public void setLeft(Node n) {
        left = n;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node n) {
        right = n;
    }

    public Node getRight() {
        return right;
    }

    public boolean hasLeft() {
        return left != null;
    }

    public boolean hasRight() {
        return right != null;
    }
}
