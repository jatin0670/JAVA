package Tree_3;

public class SagmentTree {

    public static void main(String[] args) {
        int arr[] = {3,8,7,6,-2,-8,4,9};
    }


   public static class Node{
        int data,
        int sInterval;
        int eInterval;
        Node left;
        Node right;

        Node(int sInterval, int eInterval){
            this.sInterval = sInterval;
            this.eInterval = eInterval;
        }
   }

   Node root;

   SagmentTree(int[] arr){
       // create a tree using this arr

       this.root = constructTree(arr, 0, arr.length-1);
   }

   private Node constructTree(int[] arr, int start, int end){
       if(start == end){
           //leaf node
           Node leaf = new Node(start,end);
           leaf.data = arr[start];
           return leaf;
       }

       // create a new node with index you are at
       Node node = new Node(start, end);
       int mid = (start+end)/2;

       node.left = constructTree(arr, start, mid);
       node.right = constructTree(arr, mid+1, end);

       node.data = node.left.data + node.right.data;
       return  node;
   }

}


