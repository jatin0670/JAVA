public class bubble_sort {
    public static void main(String arsg[]){
        int arr[] = {7,8,3,1,2};

        // we find big number and place them in the end by swapping (pair wise)------
        // first loop iterate n-1 times from 0 index 
        // in second loop we swap values if arr[first value]>arr[second value]   like - 7>3 then swap it 
        // time complexity - O(n^2)

        for(int i=0; i<arr.length-1; i++){              
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
