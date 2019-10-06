public class Search {

    public AANode searchNode (int n, int [] array) {

        AATree tree = new AATree(array);
        System.out.println();
        AANode k = tree.search(n);
        tree.preorder();
        return k;


    }
}
