package Trees;

import Trees.buildBinaryTreePreorder.Node.BinaryTree;

//BUILDING A BINARY TREE WITH A PREORDER SEQUENCE
public class buildBinaryTreePreorder {
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
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
        }
    }
}
