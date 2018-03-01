package Com.pinduoduo.yunwei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class TreeNode {
	public String name;
	public List<TreeNode> childs = new ArrayList<TreeNode>();

}

public class Q2 {

	public static Comparator<TreeNode> idComparator = new Comparator<TreeNode>() {
		@Override
		public int compare(TreeNode s1, TreeNode s2) {
			return s1.name.compareTo(s2.name);
		}
	};

	public static void print(TreeNode root, int floor, String pre) {
		if (root == null) {
			return;
		}
		Collections.sort(root.childs, idComparator);
		for (int i = 0; i < root.childs.size(); i++) {
			TreeNode node = root.childs.get(i);

			System.out.print(pre);
			if (i == root.childs.size() - 1) {
				System.out.println("`-- " + node.name);
				print(node, floor + 1, pre + "    ");
			} else {
				System.out.println("|-- " + node.name);
				print(node, floor + 1, pre + "|   ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		TreeNode[] nodes = new TreeNode[n];
		for (int i = 0; i < n; i++) {
			nodes[i] = new TreeNode();
		}
		TreeNode root = null;
		for (int i = 0; i < n; i++) {
			nodes[i].name = in.next();
			int parIndex = in.nextInt();
			if (parIndex == -1) {
				root = nodes[i];
			} else {
				nodes[parIndex].childs.add(nodes[i]);
			}
		}
		System.out.println(root.name);
		print(root, 0, "");
	}
}