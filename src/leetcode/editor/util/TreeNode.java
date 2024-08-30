package leetcode.editor.util;

// 实际上应该定义一棵树，把TreeNode隐藏起来，不能是裸节点，但是由于仅是做题就无关紧要了，只需要把变量public就行
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

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