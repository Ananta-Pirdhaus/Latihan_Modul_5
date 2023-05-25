/**
 * @author anant
 * @created 25/05/2023 - 9:26
 * @project Latihan Modul 5
 */
/**
 * Project COBA5
 * author Ryuu
 */



public class BinaryTree {
    public Node root;

    public void NewNode(int data) {
        root = NewNode(root, new Node(data));
    }

    private Node NewNode(Node root, Node newData) {
        if (root == null) {
            root = newData;
            return root;
        }
        if (newData.data < root.data) {
            root.left = NewNode(root.left, newData);
        } else {
            root.right = NewNode(root.right, newData);
        }
        return root;
    }


    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }



    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}