/**
 * @see <a href="https://leetcode.com/problems/trim-a-binary-search-tree">https://leetcode.com/problems/trim-a-binary-search-tree</a>
 */

public class TrimBST {
	public static void main(String[] args) {
		TreeNode case1 = new TreeNode(3);
		case1.left = new TreeNode(1);
		case1.left.right = new TreeNode(2);

		case1.right = new TreeNode(4);

		TreeNode case2 = new TreeNode(3);
		case2.left = new TreeNode(2);
		case2.right = new TreeNode(4);
		case2.left.left = new TreeNode(1);

		System.out.println(trimBST(case1, 3, 4));
		// System.out.println(trimBST(case1, 1, 1));
	}

	private static TreeNode trimBST(TreeNode root, int L, int R) {
		if (root == null) {
			return null;
		}

		if (root.val < L) {
			root = trimBST(root.right, L, R);
		} else if (root.val > R) {
			root = trimBST(root.left, L, R);
		} else {
			root.right = trimBST(root.right, L, R);
			root.left = trimBST(root.left, L, R);
		}

		return root;
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

		@Override
		public String toString() {
			return "TreeNode{" +
				"val=" + val +
				", left=" + left +
				", right=" + right +
				'}';
		}
	}


}