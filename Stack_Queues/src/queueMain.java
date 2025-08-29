public class queueMain {
    public static void main(String[] args) throws stackException {
//        customQueue queue = new customQueue(5);

//        queue.insert(4);
//        queue.insert(6);
//        queue.insert(23);
//        queue.insert(13);
//        queue.insert(67);
//
//        queue.display();
//        queue.remove();
//        queue.display();



        circularQueue queue = new circularQueue(5);
        queue.insert(4);
        queue.insert(6);
        queue.insert(23);
        queue.insert(13);
        queue.insert(67);

        queue.display();
        System.out.println(queue.remove());
        queue.insert(555);
        queue.display();



    }
}
