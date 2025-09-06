package Tree_3;

public class SagmentTree {

    public static void main(String[] args) {
        int arr[] = {3,8,7,6,-2,-8,4,9};
    }


   public static class Node{
        int data;
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

   public void display(){
       display(this.root);
   }

   private void display(Node node){
       String str = "";
       if(node.left != null){
           str = str + "Interval = [ " + node.left.sInterval + "-" + node.left.eInterval + " ] Data: " + node.left.data + " => ";
       }
       else {
           str = str + "No left child";
       }

       //current node
       str = str + "Interval = [ " + node.sInterval + "-" + node.eInterval + " ] Data: " + node.data + " => ";

       if(node.right != null){
           str = str + "Interval = [ " + node.right.sInterval + "-" + node.right.eInterval + " ] Data: " + node.right.data;
       }
       else {
           str = str + "No right child ";
       }

       System.out.println(str + '\n');

       //recursion
       if(node.left != null){
           display(node.left);
       }

       if(node.right != null){
           display(node.right);
       }

   }

   public int query(int qsi, int qei){
       return query(this.root, qsi, qei);
   }

   private int query(Node node, int qsi, int qei){
       if(node.sInterval >= qsi && node.eInterval <= qei){
           // inside
           return node.data;
       }
       else if(node.sInterval > qei || node.eInterval < qsi){
           // completely outside
           return 0;
       }
       else {
           return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
       }
   }

   // update

    public void update(int index, int val){
       this.root.data = update(this.root, index, val);
    }

    private int update(Node node, int index, int val){
         if(index >= node.sInterval && index <= node.eInterval){
             if(index == node.sInterval && index == node.eInterval){
                 return node.data = val;
             }
             else{
                 int leftAns = update(node.left, index, val);
                 int rightAns = update(node.right, index, val);

                 node.data = leftAns + rightAns;
                 return node.data;
             }
         }
         return node.data;
    }

}


