package Sort;

public class Merge {
    public static void main(String[] args){

    }
    private void mergesort(int[] arr){
    int len= arr.length;
    if (len<=1)return;

    int middle=len/2;
    int[] left=new int[middle];
    int[] right=new int[len-middle];
    int i=0;int j=0;
        for (; i <len-1 ; i++) {
            if (i < middle)
            left[i]=arr[i];
            else{
                right[j]=arr[i];
                j++;
            }
        }
        mergesort(left);
        mergesort(right);
        merge(left,right,arr);
    }
    private void merge(int[] left,int[] right,int[] parent){
    int leftlen= parent.length/2;
    int rightlen= parent.length-leftlen;
    int l=0,r=0,p=0;

    while (l<leftlen && r<rightlen){
        if (left[l]<right[r]){
            parent[p]=left[l];
            p++;l++;
        }else {
            parent[p]=right[r];
            p++;r++;
        }
    }
    while (l<leftlen){
        parent[p]=left[l];
        p++;l++;
    }
    while (r<rightlen){
        parent[p]=left[r];
        p++;r++;
        }
    }
}
