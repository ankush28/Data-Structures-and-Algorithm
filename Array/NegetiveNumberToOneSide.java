public class NegetiveNumberToOneSide {

    static void rearrange(int arr[]){
        int lo = 0;
        int hi = 0;

        while(hi <= arr.length-1){
            if(arr[hi]<0){
                int temp = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = temp;
                hi++;
                lo++;
            }else{
                hi++;
            }
        }
    }
    static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    public static void main(String args[]){
        int arr[] = {-1,2,-3,5,4,-8,1};
        rearrange(arr);
        printArray(arr);
    }
}
