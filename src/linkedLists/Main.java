package linkedLists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<>();

        //A linkedList can be used as a queue or a string allowing you to use .push() or .offer()
      /*  linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
    */
      linkedList.offer("A");
      linkedList.offer("B");
      linkedList.offer("C");
      linkedList.offer("D");
      linkedList.offer("F");
    //to add an object :
      linkedList.add(4, "E");

    //to remove an object:
      linkedList.remove("F");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        String first = linkedList.removeFirst();
        String last  = linkedList.removeLast();
        System.out.println(first + last);

      System.out.println(linkedList);


    }
}
