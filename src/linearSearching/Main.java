package linearSearching;

public class Main {
    public static void main(String[] args){
        // linear seach = Terate throught a collection one element at a time.
        // runtime complexity O(n)
        int[] array = {1, 7, 6, 5, 4,6 ,9, 10, 4};
        int index = linearSearch(array, 9);
        System.out.println(index);

        if(index ==-1){
            System.out.println("Element has not been found");
        }
        else{
            System.out.println("Element found at index:\t"+index);
        }
    }
    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;


            }
        }
        return -1;
    }
}
