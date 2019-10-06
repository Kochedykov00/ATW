Task25 {

	public static String infix(MyTree tree) {
        return infix(tree.getRoot());
    }

	public static String infix(Node root) {
        String result = "";
        if (root.getLeft() != null) {
            result += '(' +infix(root.getLeft());
        }
        result += root.getValue() + " ";
        if (root.getRight() != null) {
            result += infix(root.getRight()) + ')';
        }

        return result;

    }
}