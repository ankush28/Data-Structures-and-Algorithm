// Reverse an array or string
 public class arrayReverse{

    static void reverseArray(int arr[], int start){
        int temp;
        int end = arr.length - 1;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]);
        }
        System.out.println("");
    }
     public static void main(String[] args){
         
         int arr[] = {1,2,3,4,5,4,5,23,1,12};
         printArray(arr);
         reverseArray(arr, 0);
         System.out.println("Reversed Array is :");         
         printArray(arr);
     }
 }