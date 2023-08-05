package Trees;

import Trees.traversalBinaryTree.Node.BinaryTree;

//BUILDING A BINARY TREE
public class traversalBinaryTree {
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        tree.preOrder(root);
        System.out.println();
        tree.inorder(root);
        System.out.println();
        tree.postOrder(root);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }

        static class BinaryTree {
            static int index = -1;

            public Node buildTree(int nodes[]) {
                index++;
                if (nodes[index] == -1) {
                    return null;
                }
                Node newNode = new Node(nodes[index]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);

                return newNode;
            }

            public void preOrder(Node root) {
                if (root == null) {
                    return;
                }
                System.out.print(root.data + " ");
                preOrder(root.left);
                preOrder(root.right);
            }

            public void inorder(Node root) {
                if (root == null) {
                    return;
                }
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }

            public void postOrder(Node root) {
                if (root == null) {
                    return;
                }
                postOrder(root.left);
                postOrder(root.right);
                System.out.print(root.data + " ");
            }
        }
    }
}
