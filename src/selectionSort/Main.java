package selectionSort;

public class Main {
    public static void main(String[] args){
        //has a runtime complexity of O(n^2)
        int array[] = {3, 4, 5, 6, 7, 1, 2, 9, 8};

        selectionSort(array);

        for(int i : array){
            System.out.print(i);
        }

    }

    private static void selectionSort(int[] array) {
        for(int i = 0; i <array.length-1; i++){
            int min = i;
            for(int j = i+1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }

            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }

    }
}
