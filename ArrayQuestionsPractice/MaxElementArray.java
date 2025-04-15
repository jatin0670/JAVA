public class MaxElementArray {

    static int max(int[] array){
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {3,7,5,9,1};

        System.out.println(max(arr));

    }
}
