class BubbleSort{

    public static int[] sort(int[] arr){
         int n= arr.length-1;
         int temp;
         for (int i=0; i<n;i++){
            for (int j=0; j<n-i; j++){
                if(arr[j]>arr[j+1]){
                temp=arr[j];
                arr[j]= arr[j+1];
                arr[j+1]= temp;
                }
            }
         }
         return arr;
    }
    public static void main(String[] args) {
        int arr[]= {2,5,1,3,6,4};
        int sortedArr[] = sort(arr);

        for(int i=0 ; i< sortedArr.length; i++){
            System.out.println(sortedArr[i]);
        }
    }
}