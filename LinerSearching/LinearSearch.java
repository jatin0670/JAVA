public class LinearSearch {

    static int Linear(int[] array, int x){
        for(int i=0; i<array.length; i++){
             if(x==array[i]){
                return i;
             }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,5,8,13,9};
        System.out.println(Linear(arr, 13));
    }

    
}
