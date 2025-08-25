public class DLL {

   private Node head;

//   private int size;

//   DLL(){
//       size = 0;              my version of insertLast
//   }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
//        size++;
    }

//    public void insertLast(int val){        my version of insertLast
//          Node node = new Node(val);
//          Node temp =  get(size-1);
//          temp.next = node;
//          node.prev = temp;
//          size++;
//
//    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next!=null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void insert(int after, int val){
        Node p = find(after);
        if(p == null){
            System.out.println("doesn't exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public Node find(int val){
        Node node = head;
        while(node != null) {
            if (node.val == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("end");

        System.out.println("Reverse");
        while(last != null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("start");
    }


//    public Node get(int index){
//       Node node = head;
//       for(int i=0; i<index; i++){
//           node = node.next;
//       }
//       return node;
//    }



    private class Node{
       private int val;
       private Node next;
       private Node prev;


        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

}
