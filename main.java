// //! ------------------------------------------ 01 :: MIN MAX IN ARRAY
// public final class main {
// public static void main(String[] args){
//     int[]arr = {10,3,4,34,54,33};
//     findMinAndMax(arr);
//     }
//     static void findMinAndMax (int[] arr) {
//         if(arr == null || arr.length ==0) return;
//         int min = arr[0];
//         int max = arr[0];

//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] < min){
//                 min = arr[i];
//             }
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
//         System.out.println(min);
//         System.out.println( max);
//     }
// }


public final class main {
public static void main(String[] args){
    int[]arr = {10,90,8,5,3,4,34,54,33};
    findMinAndMax(arr);
    }
    static void findMinAndMax (int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}


//! ------------------------------------------ 02 :: REVERSE THE ARRAY

// import java.lang.reflect.Array;
// import java.util.Arrays;
// public final class main {
// public static void main(String[] args){
//     int[]arr = {10,3,4,34,54,33};
//     reverseArr(arr);
//     }
//     static void reverseArr (int[] arr) {
//         int i = 0;
//         int j = arr.length -1;
//         int temp;
//         while (i < j) {
//             temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;

//             i++;
//             j--;
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }


//! ------------------------------------------ 02 :: DUplicate Arr


// import java.lang.reflect.Array;
// import java.util.Arrays;
// public final class main {
// public static void main(String[] args){
//     int[]arr = {10,34,3,4,34,54,33};
//     duplicateArray(arr);
//     }
//     static void duplicateArray (int[] arr) {
//         for(int i = 0; i < arr.length; i++){
            
//         }
//     }
// }

