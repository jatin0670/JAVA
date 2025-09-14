import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Heap<Integer> heap = new Heap<>();

        heap.insert(34);
        heap.insert(22);
        heap.insert(54);
        heap.insert(32);
        heap.insert(45);

//        System.out.println(heap.remove());

        ArrayList list = heap.heapSort();
        System.out.println(list);

    }
}