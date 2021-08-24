public class maxNmin {

    static void max(int arr[]){
        int max = arr[0];
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    static void min(int arr[]){
        int min = arr[0];
        for(int i = 0; i<arr.length ; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print(min);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,59};
        System.out.print("Maximum Number is: ");
        max(arr);
        System.out.print("Minimum Number is: ");
        min(arr);
    }
}
