public class OrderAgnosticBS {
    
    static int OABS(int[] array, int target){
        int start = 0;
        int end = array.length-1;

        boolean isAsc;
        if(array[start]<array[end]){
            isAsc = true;
        }
        else{
            isAsc = false;
        }

        while(start<=end){
           // int mid = (start+end)/2  --- not the best way to find mid index
           int mid = start + (end-start)/2;

           if(array[mid]==target){
              return mid;
           }

           if(isAsc){
            if(target<array[mid]){
            end = mid-1;
           }
           else{
            start = mid+1;
           }
        }
        else{
            if(target<array[mid]){
                start = mid+1;
               }
               else{
                end = mid-1;
               }
        }
    }
        return -1; //not found
    }
    
    public static void main(String[] args) {
        int[] AscArr = {1,6,7,9,11,23,65,78,89,96};
        int[] DeAscArr = {98,76,65,54,43,32,21,11,5,3};

        int ansForASc =  OABS(AscArr, 65);
        System.out.println(ansForASc);

        int ansForDeaAsc =  OABS(DeAscArr, 54);
        System.out.println(ansForDeaAsc);
        
    }
}
