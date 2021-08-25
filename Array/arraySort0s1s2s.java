public class arraySort0s1s2s {
// Dutch National Flag ALgorithm
    static void sort0s1s2s(int arr[]){
        int lo = 0;
        int hi = arr.length - 1;
        int mid = 0;
        while(mid <= hi){
            switch(arr[mid]){
                case 0:{
                    int temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    int temp = arr[mid];
                    arr[mid] = arr[hi];
                    arr[hi] = temp;
                    hi--;
                    break;
                }
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
        int arr[] = {0,2,2,1,2,0,1,2};
        sort0s1s2s(arr);
        printArray(arr);
    }
}
