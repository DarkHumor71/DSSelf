package Sort;

public class Quicksort {
    public static void main(String[] args){
        int[] arr={9,0,1,3,7,4,2,6,8,5};
        quickSort(arr,0,arr.length-1);
        for (int x:arr){
            System.out.print(x+" ");
        }
    }

    private static void quickSort(int[] arr, int first, int last) {
        if (last<=first)return;

        int pivot=partition(arr,first,last);
        quickSort(arr, first, pivot-1);
        quickSort(arr, pivot+1, last);
//        quickSort();
    }
    private static int partition(int[] arr, int first, int last){
        int pivot=arr[last];
        int i=first-1;
        int j = first;
        for (;j< last;j++){
            if (arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[i+1];
        arr[i+1]=arr[last];
        arr[last]=temp;
    return i+1;
    }
}
