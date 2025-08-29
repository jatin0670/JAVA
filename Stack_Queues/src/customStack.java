public class customStack {
    public int[] data;
    protected static final int DEFAULTSIZE = 10;
    int ptr = -1;

    customStack(int size){
        this.data = new int[size];
    }

    customStack(){
        this(DEFAULTSIZE);
    }

    public boolean push(int val){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public int pop() throws stackException{
        if(isEmpty()){
            throw new stackException("stack is empty");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws stackException{
        if(isEmpty()){
            throw new stackException("stack is empty");
        }
        return data[ptr];
    }

    private boolean isEmpty(){
        return ptr == -1;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

}
