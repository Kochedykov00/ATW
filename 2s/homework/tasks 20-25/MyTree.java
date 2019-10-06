import java.util.*;

public class MyTree {

	Node root;
	
	public static void printTree(Node n, int k) {
		if (n != null ){
			printTree(n.right, k + 1);
			for (int i = 0; i < k; i++) {
				System.out.print("  ");
			}
			System.out.println(n.value);
			printTree(n.left, k + 1);	
		}
	}
	
	public static void create(Node n, int k) {
		n.value = k;
		int left = k / 2;
		int right = k - 1 - left;
		if (left > 0) {
			n.left = new Node();
			createTree(n.left, left);
		}
		if (right > 0) {
			n.right = new Node();
			createTree(n.right, right);
		}
				
	}
	
	public static void BFS(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int counter = 0;
		while (!q.isEmpty()) {
			Node p = q.poll();
			p.value = counter++;
			if (p.left != null) {
				q.offer(p.left);
			}
			if (p.right != null) {
				q.offer(p.right);
			}
		}
	}
	static int static_counter = 0;
	public static void DFS(Node p) {
		if (p != null) {
			parseDFsearchLRoRi(p.left);
			p.value = static_counter++;
			parseDFsearchLRoRi(p.right);
		}
	}

	
}