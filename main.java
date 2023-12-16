//! ------------------------------------------01 :: MIN MAX
public final class main {
public static void main(String[] args){
    int[]arr = {10,3,4,34,54,33};
    findMinAndMax(arr);
    }
    static void findMinAndMax (int[] arr) {
        if(arr == null || arr.length ==0) return;
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println( max);
    }
}