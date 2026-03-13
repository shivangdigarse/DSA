package tree;

public class Ah_sumofnode {
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
    public static int sumOfNode(Node root){
        
        if(root == null){
            return 0;
        }
        int left_Sum = sumOfNode(root.left);
        int right_Sum = sumOfNode(root.right);
        return left_Sum + right_Sum + root.val;

    }
    public static void main(String[] args) {
        int[] preorder ={1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        Node root = buildTree(preorder);
        System.out.println(sumOfNode(root));
    }
}
