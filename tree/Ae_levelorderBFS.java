package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Ae_levelorderBFS {
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

    public static void LevelOrder_traversal(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node n = queue.poll();
            System.out.println(n.val);
            if(n.left != null){
                queue.add(n.left);
            }
            if(n.right != null){
                queue.add(n.right);
            }
        }
    }

    public static void main(String[] args) {
        int[] preorder = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        Node root = buildTree(preorder);
        LevelOrder_traversal(root);
    }
}
