
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(8);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        System.out.println("Deleted first " + list.deleteFirst());
        list.display();
        System.out.println("Deleted last " + list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
//        System.out.println(list.find(5));     find node
    }
}