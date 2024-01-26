package Search;

public class Linear {
    public static void main(String[] args){
        // linear search = Iterate through a collection one element at a time
        // runtime complexity: O(n)

        //Disadvantages:
        //Slow for large data sets

        //Advantages:
        //Fast for searches of small to medium data sets
        //Does not need to sorted
        //Useful for data structures that do not have random access (Linked List)

        int[] array={9,1,8,2,7,3,6,4,5};
        int index=LinearSearch(array,1);
    }
    private static int LinearSearch(int[] a, int b){
        for (int i=0;i<a.length;i++){
            if (b==a[i])return i;
        }
        return -1;
    }
}
