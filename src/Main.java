
public class Main {
    public static void main(String[] args) {
        int[] arr = {100, 7, 6, 120, 56, 99, 99, 200, 99, 200};
        Tree tree = new Tree(false);

        for (int i = 0; i < arr.length; i++) {
            tree.add(arr[i]);
        }

        System.out.println("-------------------");
        System.out.println("Total nodes: " + tree.getTotal());
        System.out.println("-------------------");
        System.out.println("Is contains 56? " + tree.contain(56));
        System.out.println("Is contains 71? " + tree.contain(71));
        System.out.println("-------------------");
        System.out.println("Count of 99: " + tree.count(99));
        System.out.println("Count of 120: " + tree.count(120));
        System.out.println("Count of 200: " + tree.count(200));
    }
}
