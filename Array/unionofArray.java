public class unionofArray {
    static void union(int arr1[], int arr2[]){
        int co = 0;
        for(int i=0 ; i<arr1.length ; i++){
            for(int j=0 ; j<arr2.length ; j++){
                if(arr1[i]==arr2[j]){
                    co++;
                }
            }
        }
        System.out.print(co);
    }
    public static void main(String[] args) {
        int arr1[] = {1,2};
        int arr2[] = {1,2,3,4};
        union(arr1, arr2);
    }
}
