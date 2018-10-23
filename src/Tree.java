
import java.util.ArrayList;

public class Tree {
    private static ArrayList<Node> tree = new ArrayList<>();
    private static Node current;
    private boolean debug;

    Tree(boolean d) {
        debug = d;
    }

    private void print(String s) {
        if (debug) {
            System.out.println(s);
        }
    }

    public void add(Integer v) {
        if (tree.size() == 0) {
            current = new Node(v);
            tree.add(current);
        } else {
            while (true) {
                print("StartCurrent: " + current.getValue());
                if (v >= current.getValue()) {
                    if (current.hasRight()) {
                        current = current.getRight();
                    } else {
                        Node node = new Node(v);
                        current.setRight(node);
                        print("Current: " + current.getValue());
                        print(" Set right: " + node.getValue());
                        tree.add(node);
                        break;
                    }
                } else {
                    if (current.hasLeft()) {
                        current = current.getLeft();
                    } else {
                        Node node = new Node(v);
                        current.setLeft(new Node(v));
                        print("Current: " + current.getValue());
                        print(" Set left: " + node.getValue());
                        tree.add(node);
                        break;
                    }
                }
            }
        }
    }

    public int getTotal() {
        return tree.size();
    }

    public boolean contain(int v) {
        Node current = tree.get(0);
        while (true) {
            if (v == current.getValue()) {
                return true;
            }
            if (v >= current.getValue() && current.hasRight()) {
                current = current.getRight();
            } else if (current.hasLeft()) {
                current = current.getLeft();
            } else {
                return false;
            }
        }
    }

    public int count(int v) {
        int cnt = 0;
        if (tree.size() == 0)
            return cnt;

        Node current = tree.get(0);
        while (true) {
            if (v == current.getValue()) {
                cnt++;
            }
            if (v >= current.getValue() && current.hasRight()) {
                current = current.getRight();
            } else if (current.hasLeft()) {
                current = current.getLeft();
            } else {
                return cnt;
            }
        }
    }
}
