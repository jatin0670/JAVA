

public class LL {

    private Node head;
    private Node tail;
    private int size;

    LL(){
        this.size = 0;
    }



   private class Node{
        private int value;
        private Node next;

        Node(int value){
            this.value = value;
        }

        Node(int value, Node next){
            this.value = value;
            this.next = next;
        }


    }
}
