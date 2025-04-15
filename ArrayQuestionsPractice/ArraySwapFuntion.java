public class ArraySwapFuntion {

    static void arrSwap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {

    int[] arr = {1,2,3,4,5};

    arrSwap(arr, 0 , 4);

    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
  }
}
