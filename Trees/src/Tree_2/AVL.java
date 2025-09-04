package Tree_2;


public class AVL {

    class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        Node(int value) {
            this.value = value;
        }

        public int getVal() {
            return value;
        }
    }

    AVL() {

    }

    private Node root;

    public int height(){
        return getHeight(root);
    }
    public int getHeight(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int val) {
        root = insert(val, root);
    }

    private Node insert(int val, Node node) {
        if (node == null) {
            node = new Node(val);
            return node;
        }
        if (val < node.value) {
            node.left = insert(val, node.left);
        }

        if (val > node.value) {
            node.right = insert(val, node.right);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;

        return Rotate(node);
    }

    public Node Rotate(Node node){
        if(getHeight(node.left) - getHeight(node.right) > 1){
            // heavy left
            if(getHeight(node.left.left) - getHeight(node.left.right) > 0){
                // left left case
                return rightRotate(node);
            }

            if(getHeight(node.left.left) - getHeight(node.left.right) < 0){
                // left rigth case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(getHeight(node.left) - getHeight(node.right) < -1){
            // heavy rigth
            if(getHeight(node.right.left) - getHeight(node.right.right) < 0){
                // right right case
                return leftRotate(node);
            }

            if(getHeight(node.right.left) - getHeight(node.right.right) > 0){
                //  right left case
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(getHeight(p.left), getHeight(p.right) + 1);
        c.height = Math.max(getHeight(c.left), getHeight(c.right) + 1);

        return p;
    }

    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(getHeight(p.left), getHeight(p.right) + 1);
        c.height = Math.max(getHeight(c.left), getHeight(c.right) + 1);

        return c;
    }



    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    //if array is sorted

    public void populatesort(int[] nums){
        populatesort(nums, 0, nums.length);
    }

    private void populatesort(int[] nums, int start, int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        this.insert(nums[mid]);
        populatesort(nums, start, mid);
        populatesort(nums, mid+1, end);
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(getHeight(node.left) - getHeight(node.right)) >= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root node: ");
    }

    private void display(Node node, String detailes) {
        if (node == null) {
            return;
        }

        System.out.println(detailes + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

}