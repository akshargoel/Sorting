public class SelectionSort {

    public static void sort(int arr[]){
        int temp;

        for(int i=0; i<arr.length-1; i++){
            int minIndex= i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minIndex]>arr[j]){
                    minIndex= j;
                }
            }
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]= temp;
        }
        printSortedArray(arr);
    }

    public static void printSortedArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print ( arr[i]+ ",");
        }
    }
    
    public static void main(String args[]){
        int arr[]= {5,3,2,1,4};
        sort(arr);
    }
}
