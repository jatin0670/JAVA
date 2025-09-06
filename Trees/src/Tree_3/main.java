package Tree_3;

public class main {
    public static void main(String[] args) {
//        int arr[] = {3,8,6,7,-2,-8,4,9};
        int arr[] = {3,4,5,-2,8,1};
        SagmentTree tree = new SagmentTree(arr);
//        tree.display();

        int ans = tree.query(0, 2);
        System.out.println(ans);
    }
}
