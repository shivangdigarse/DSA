package tree;

public class Ab_preorder {
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

    public static void PreOrder_traversal(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        PreOrder_traversal(root.left);
        PreOrder_traversal(root.right);
        return;
    }

    public static void main(String[] args) {
        int[] preorder ={1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        Node root = buildTree(preorder);
        PreOrder_traversal(root);
    }
}
