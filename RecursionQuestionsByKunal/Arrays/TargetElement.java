import java.util.ArrayList;

public class TargetElement {
    public static void main(String[] args) {
        int arr[] = {1,6,7,4,4,22,55};
        // int ans = find(arr, 22, 0);
        // System.out.println(ans);

        // boolean ans1 = find1(arr, 22, 0);
        // System.out.println(ans1);

        // findall(arr, 4, 0);
        // System.out.println(list);

        // ArrayList<Integer> ans = findall2(arr, 4, 0, new ArrayList<>());
        // System.out.println(ans);
        

        System.out.println(findall3(arr, 4, 0));
    }

    static int find(int[] arr, int target, int index){
        //base condition
        

        if(arr[index] == target){
            return index;
        }
        else{
           return  find(arr, target, index + 1);
        }
    
    }


    // kunal version------------------

    static boolean find1(int[] arr, int target, int index){
        if(index == arr.length){
         return false;  
        }
        return arr[index] == target || find1(arr, target, index + 1);
    }


    // find all index------------ 01

    static ArrayList<Integer> list = new ArrayList<>();

    static void findall(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }
        findall(arr, target, index + 1);
    }


    // find all index--------------------02

    static ArrayList<Integer> findall2(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return findall2(arr, target, index + 1, list);
    }


    // find all index -----------------------03 (not a good approch because we creating list again and again)

    static ArrayList<Integer> findall3(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        // this will contain ans for that f(n) call
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalss = findall3(arr, target, index + 1);
        list.addAll(ansFromBelowCalss);
        return list;

    }
}
