public class selection_sort {
   public static void main (String args[]){
     
    int arr[] = {7,8,3,1,2};

    //we find smallest number and put it into first postion(i'th postion we can say that)
    // time complexity O(n^2)
    for(int i=0; i<arr.length-1; i++){
        int smallest = i;
        
        for(int j=i+1; j<arr.length; j++){
           if(arr[smallest]>arr[j]){
            smallest = j;
           }
        }
        int temp = arr[i];
        arr[i] = arr[smallest];
        arr[smallest] = temp;
    }
     
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }


    }
}
