package tree;

public class Af_height {
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

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) +1;
    }

    public static void main(String[] args) {
        int[] preorder = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        Node root = buildTree(preorder);
        System.out.println(height(root));

    }
}
