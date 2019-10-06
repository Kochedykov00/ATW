Public class Task23 {

	public static String postfix(MyTree tree) {
        return postfix(tree.getRoot());
    }

    private static String postfix(Node root) {
        String result = "";
        if (root.getLeft() != null) {
            result += postfix(root.getLeft());
        }

        if (root.getRight() != null) {
            result += postfix(root.getRight());
        }
        return result + root.getValue() + " ";
    }
}

    