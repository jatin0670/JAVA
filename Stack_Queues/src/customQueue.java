public class customQueue {
    private int[] data;
    protected static final int DEFAULTSIZE = 10;
    int end = 0;

    customQueue(int size){
        this.data = new int[size];
    }

    customQueue(){
        this(DEFAULTSIZE);
    }

    public boolean insert(int val){
        if(isFull()){
            return false;
        }

        data[end++] = val;
        return true;
    }

    public int remove() throws stackException{
        if(isEmpty()){
            throw new stackException("queue is empty");
        }
        int removed = data[0];
        //shift the elements to the left

        for(int i = 1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;

        return  removed;
    }

    public int front() throws stackException{
        if(isEmpty()){
            throw new stackException("queue is empty");
        }
        return data[0];
    }

    public void display(){
        for(int i=0; i<end; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }

    private boolean isEmpty(){
        return end == 0;
    }

    public boolean isFull() {
        return end == data.length;
    }

}
