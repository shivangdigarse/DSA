package tree;

public class Aj_isSubtree {
    static int index = -1;
    public static Node buildTree(int[] arr){
        index++;
        if(arr[index]==-1){
            return null;
        }
        Node root = new Node(arr[index]);
        root.left = buildTree(arr);
        root.right = buildTree(arr);
        return root;
    }
    public static boolean checkIdentical(Node root1, Node root2){
        if (root1 == null || root2 == null) {
            return root1 == root2;
        }
        boolean checkLeft = checkIdentical(root1.left, root2.left);
        boolean checkRight = checkIdentical(root1.right, root2.right);
        return checkLeft && checkRight && root1.val == root2.val;
    }
    public static boolean isSubtree(Node root, Node subroot) {
        if (root == null) return false;

        if (root.val == subroot.val && checkIdentical(root, subroot)) {
            return true;
        }

        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String[] args) {
        int[] preorder1 = {10, 5, 2, -1, -1, 7, -1, -1, 15, 12, -1, -1, 20, -1, -1};
        int[] preorder2 = {8, 3, 1, -1, -1, 6, 4, -1, -1, 7, -1, -1, 10, -1, 14, 13, -1, -1, -1};
        Node root1 = buildTree(preorder1);
        index = -1;
        Node root2 = buildTree(preorder2);
        index = -1;
        System.out.println(isSubtree(root1, root2));
        System.out.println(isSubtree(root1, root1));
    }
}
