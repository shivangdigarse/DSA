package tree;

public class Am_BST {

    // Insert a node into the BST and return the updated root
    public static Node insert(Node root, int num) {
        if (root == null) {
            return new Node(num); // First node or leaf position found
        }

        if (num <= root.val) {
            root.left = insert(root.left, num); // Insert in left subtree
        } else {
            root.right = insert(root.right, num); // Insert in right subtree
        }
        return root; // Return the unchanged root pointer
    }

    // Optional: Inorder traversal to verify tree structure
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 50); // First node
        insert(root, 30);
        insert(root, 70);
        insert(root, 20);
        insert(root, 40);
        insert(root, 60);
        insert(root, 80);

        System.out.print("Inorder Traversal: ");
        inorder(root); // Output: 20 30 40 50 60 70 80
    }
}