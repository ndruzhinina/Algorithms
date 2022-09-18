public class SameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q) {
            return true;
        } else {
            return p != null && q != null &&
                    p.val == q.val &&
                    isSameTree(p.left, q.left) &&
                    isSameTree(p.right, q.right);
        }
    }

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(1, new TreeNode(2), null);
        TreeNode tree2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode tree3 = new TreeNode(1);
        TreeNode tree4 = new TreeNode(1);

        System.out.println(isSameTree(tree3, tree4));

    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}