public class MinElementArray {

    static int Min(int[] array){
        if(array.length==0){
            return -1;
        }

        int min = array[0];
        for(int i=1; i<array.length; i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,7,9};
        System.out.println(Min(arr));
    }
}
