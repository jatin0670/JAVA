public class SearchInRange {

    static int SIR(int[] array, int target, int start, int end){
        for(int i=start; i<=end; i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,8,2,6,9,3};
        int index = SIR(arr, 6, 1, 5);
        System.out.println(index);
    }
}
