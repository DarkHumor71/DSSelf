package Search;


public class Binary {
    public static void main(String[] args){
        int[] arr =new int[100];
        int tar=42;
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=i;
        }
//        Arrays.binarySearch(arr,tar);
    }
    private int binarySearch(int [] a,int b){
        int low=0;
        int high=a.length-1;
        while (low<=high){
        int middle= low + (high-low)/2;
        int val=a[middle];
        if(val<middle)low=middle+1;
        if(val>middle)high=middle-1;
        if (val==middle)return middle;
        }
        return -1;
    }
}
