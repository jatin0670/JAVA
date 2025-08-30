import java.util.Stack;

public class queueUsingStack{
    public static void main(String[] args) {
        addEfficient list = new addEfficient();

        list.add(2);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(6);

        System.out.println(list.remove());
    }

    static class addEfficient{
        private Stack<Integer> first;
        private Stack<Integer> second;

        addEfficient(){
            first = new Stack<>();
            second = new Stack<>();
        }


        // element add efficient
        public void add(int item){
            first.push(item);
        }

        public int remove(){
            while(!first.empty()){
                second.push(first.pop());
            }
            int removed = second.pop();

            while(!second.empty()){
                first.push(second.pop());
            }
            return removed;
        }
    }



    //remove efficient
    static class removeEfficient{
        private Stack<Integer> first;
        private Stack<Integer> second;

        removeEfficient(){
            first = new Stack<>();
            second = new Stack<>();
        }


        // element add efficient
        public void add(int item){
            while(!first.isEmpty()){
                second.push(first.pop());
            }
            first.push(item);

            while(!second.isEmpty()){
                first.push(second.pop());
            }
        }

        public int remove(){
            return first.pop();
        }
    }
}




