package Sort;

public class Bubble {
    public static void main(String[] args){
//        bubble sort
//        pairs of adjacent elements are compared, and the elements
//        swapped if they are not in order.

//          Quadratic time O(nA2)
//          small data set z okay-ish
//          large data set = bad
        int[] arr={9,5,1,3,7,4,2,6,8,0};
        bubble(arr);
    }
private static void bubble(int[] arr){
    for (int i = 0; i <arr.length-1 ; i++) {
        for (int j = 0; j < arr.length-i-1 ; j++) {
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
} 
}
