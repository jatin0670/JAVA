package Tree_1;

import java.util.Scanner;

public class BinaryTree {


    class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }


    private Node root;
    // insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root node");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node){
        System.out.println("do you want to insert left side of " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of left " + node.value);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner, node.left);
        }

        System.out.println("do you want to insert the right of " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the right " + node.value);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }

    }

    public void display(){
        display(this.root, "");
    }

    public void display(Node node, String Intend){
        if(node == null){
            return;
        }

        System.out.println(Intend + node.value);
        display(node.left, Intend + "\t");
        display(node.right, Intend + "\t");
    }

    public void preetyDisplay(){
        preetyDisplay(root, 0);
    }


    public void preetyDisplay(Node node, int level){
        if(node == null){
            return;
        }

        preetyDisplay(node.right, level + 1);

        if(level!=0){
            for(int i=0; i<level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.value);
        }
        else {
            System.out.println(node.value);
        }
        preetyDisplay(node.left, level + 1);
    }


}
