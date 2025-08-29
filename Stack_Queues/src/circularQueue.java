public class circularQueue {
    protected int[] data;
    private static final int DEFAULTSIZE = 10;
    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    circularQueue(int size){
        this.data = new int[size];
    }

    circularQueue(){
        this(DEFAULTSIZE);
    }

    public boolean insert(int val){
        if(isFull()){
            return false;
        }

        data[end++] = val;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws stackException{
        if(isEmpty()){
            throw new stackException("queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;

        return  removed;
    }

    public int front() throws stackException{
        if(isEmpty()){
            throw new stackException("queue is empty");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
        }
       int i = front;
       do{
           System.out.print(data[i] + " ");
           i++;
           i %= data.length;
       }while(i!=end);
        System.out.println("END");
    }

    private boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }




}
