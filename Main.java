public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();
        bst.put(5, "Value 5");
        bst.put(3, "Value 3");
        bst.put(7, "Value 7");
        bst.put(2, "Value 2");
        bst.put(4, "Value 4");
        bst.put(6, "Value 6");
        bst.put(8, "Value 8");

        /**
         * Defence code check
         */
        System.out.println(bst.consistent(5));
        System.out.println(bst.consistent(2));
        System.out.println(bst.consistent(8));
        System.out.println(bst.consistent(1));
        System.out.println(bst.consistent(9));
    }

}
