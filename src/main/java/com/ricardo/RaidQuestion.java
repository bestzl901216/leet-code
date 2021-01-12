package com.ricardo;


/**
 * @author Ricardo
 */
public class RaidQuestion {
    private static int[] dp;

    static int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int coin : coins) {
                int dp = getDp(i - coin);
                if (dp < 0) {
                    continue;
                }
                min = Math.min(min, dp + 1);
            }
            dp[i] = min;
        }
        return dp[amount];
    }

    private static int getDp(int i) {
        if (i < 0) {
            return -1;
        } else if (i == 0) {
            return 0;
        } else {
            return dp[i];
        }
    }

    static int maxProfit(int[] prices) {
        int x = prices.length;
        int y = 1;
        int z = 2;
        int[][][] dp = new int[x][y][z];
        return 0;
    }

    private void plusOne(TreeNode root) {
        if (root == null) {
            return;
        }
        root.value++;
        plusOne(root.left);
        plusOne(root.right);
    }

    private Boolean isBST(TreeNode root) {
        return isBST(root, null, null);
    }

    private Boolean isBST(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.value <= min) {
            return false;
        }
        if (max != null && root.value >= max) {
            return false;
        }

        return isBST(root.left, min, root.value) && isBST(root.right, root.value, max);
    }

    private boolean isInBST(TreeNode root, int target) {
        if (root == null) {
            return false;
        }
        if (root.value < target) {
            return isInBST(root.right, target);
        }
        if (root.value > target) {
            return isInBST(root.left, target);
        }
        return true;
    }

    private TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.value == key) {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            TreeNode min = getMin(root.right);
            root.value = min.value;
            root.right = deleteNode(root.right, min.value);
        } else if (root.value < key) {
            root.right = deleteNode(root.right, key);
        } else {
            root.left = deleteNode(root.left, key);
        }
        return root;
    }

    private TreeNode getMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}

class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;
}
