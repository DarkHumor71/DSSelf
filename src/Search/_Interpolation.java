package Search;

public class _Interpolation {
    public static void main(String[] args){
        // interpolation
//        search improvement =over binary search best used for "uniformly" distributed data
//        "guesses" where a value might be based on calculated probe results
//        if probe is incorrect, search area is narrowed, and a new probe is calculated

//        average case: O(log(log(n)))
//        worst case: O(n) [values increase exponentially]
        int[] arr={1,2,3,4,5,6,7,8,9};
        int index= interpolation(arr,8);
    }
    private static int interpolation(int[] array,int value){
        int high=array.length-1;
        int low=0;
        while(value>=array[low] && value<=array[high] && low<=high){
            int probe=
                    low + (high - low) *
                            (value-array[low]) /
                            (array[high]-array[low]);
            if (array[probe]==value) return probe;
            else if (array[probe]<value)
                low=probe+1;
            else high=probe-1;
        }
        return -1;
    }
}
