package dynamicArray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
      //  ArrayList<String> arrayList = new ArrayList<>();
        DynamicArray array = new DynamicArray(5);
        System.out.println(array.capacity);

        array.add("A");
        array.add("B");
        array.add("C");
        array.add(1);
        array.add(6.7);
        array.add('*');

       // array.insert(0, "X");
        // array.delete("A");

        System.out.println(array);
        System.out.println("Size : "+ array.size);
        System.out.println("Capacity : " + array.capacity);





    }
}
