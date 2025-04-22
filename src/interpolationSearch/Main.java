package interpolationSearch;
//interpolation search = improvement over binary search best used for "uniformly" distributed "guesses"
// where a value might be based on calculated probe results
//if probe is incorrect, search area is narrowed, and a new probe is calculated
// average case: O(log(log(n)))
// worst case: O(n) [value increases exponentially]

public class Main {
    public static void main(String[] args){
        int array[] = {1, 2, 3, 4 ,5 ,6 ,7 ,8 ,9 ,10, 11 ,12 ,13 ,14,15,15 ,16 ,17, 18,19,20,21,22,23,24,25,26,27,28,29};
         int index = interpolationSearch(array, 21);
         if(index == -1){
             System.out.println("The value was not found");
         }
         else System.out.println("The value was found at index" + index);
    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length -1;
        int low = 0;
        while(value>= array[low] && value <= array[high] && low <=high){
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("probe : "+probe);
            if(array[probe] == value){
                return probe;
            }
            else if(array[probe] < value){
                low = probe + 1;
            }
            else high = probe -1;
    }
        return -1;

    }
}
