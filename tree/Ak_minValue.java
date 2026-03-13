package tree;
public class Ak_minValue {
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
    public static int minValue(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        minValue(root.left);
        minValue(root.right);
        return Math.min(root.val, Math.min(minValue(root.left),minValue(root.right)));
    }
    public static void main(String[] args) {
        int[] preorder ={-10,2,-1,-1,3,4,-1,-1,5,-1,-1};
        Node root = buildTree(preorder);
        System.out.println(minValue(root));
    }
}
