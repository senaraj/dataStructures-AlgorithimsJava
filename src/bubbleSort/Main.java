package bubbleSort;

public class Main {
    public static void main(String[] args){
        // has a runtime effieceny of O(n^2)
        int array[] = {9, 1, 6, 7, 4, 8, 2, 3, 5};
        bubbleSort(array);
        for(int i : array){
            System.out.print(i + " ");
        }


    }
    public static void bubbleSort(int array[]){
        for(int i = 0; i < array.length -1 ; i++){
            for(int j = 0 ;j < array.length-i -1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }
    }
}
