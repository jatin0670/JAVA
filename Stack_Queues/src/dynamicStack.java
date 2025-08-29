public class dynamicStack extends customStack{
    dynamicStack(){
        super();
    }

    dynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int val) {
        // this will run when stack is full
        if(this.isFull()){
            int[] temp = new int[data.length * 2];

            for(int i=0; i<data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }

        //this run when stack isn't full
        return super.push(val);
    }
}
