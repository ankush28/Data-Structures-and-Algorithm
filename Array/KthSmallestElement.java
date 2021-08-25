public class KthSmallestElement{
    static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    static void kthMaxnmin(int arr[], int k){
        System.out.println("Kth max element for k: "+ k +" is "+ arr[arr.length-k]);
        System.out.println("Kth min element for k: "+ k +" is "+arr[k-1]);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        bubbleSort(arr);
        kthMaxnmin(arr, 2);
      
    }
}