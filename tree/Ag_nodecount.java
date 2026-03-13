package tree;

public class Ag_nodecount {
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

    static int nodeCount = 0;
    static int leafCount = 0;
    static int internalCount = 0;
    public static void count(Node root){
        if(root == null){
            return;
        }
        if(root.left != null || root.right != null){
            nodeCount++;
            internalCount++;
        }
        if(root.left == null && root.right == null){
            leafCount++;
            nodeCount++;
        }
        count(root.left);
        count(root.right);
    }
    public static void main(String[] args) {
        int[] preorder = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        Node root = buildTree(preorder);
        count(root);
        System.out.println("Number of Nodes: " + nodeCount);
        System.out.println("Number of Internal Node: " + internalCount);
        System.out.println("Number of Leaf Node: " + leafCount);
    }
}
