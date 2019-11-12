package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import LeetCode.extra.TreeNode;

public class DfsTheTree {

	/*
	 * �ǵݹ�ʵ�� ��1��ջS��ʼ����visited[n]=0�� ��2�����ʶ���v��visited[v]=1������v��ջS
	 * 
	 * ��3��while(ջS�ǿ�)
	 * 
	 * x=ջS�Ķ�Ԫ��(����ջ)��
	 * 
	 * if(�ҵ����ڲ�δ�����ʵ�x���ڽӵ�w)
	 * 
	 * ����w��visited[w]=1��
	 * 
	 * w��ջ;
	 * 
	 * else
	 * 
	 * x��ջ��
	 * 
	 */
	// Dfs���������� ��ѹջ������ Ȼ��������
	public List<TreeNode> Dfs_tree(TreeNode root) {
		Stack<TreeNode> sta = new Stack<>();
		List<TreeNode> res = new ArrayList<>();
		if (root == null)
			return null;
		// res.add(root);
		sta.add(root);
		while (!sta.isEmpty()) {
			TreeNode temp = sta.pop();
			res.add(temp);
			if (temp.right != null)
				sta.push(temp.right);
			if (temp.left != null)
				sta.push(temp.left);
		}
		return res;

	}

}
