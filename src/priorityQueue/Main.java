package priorityQueue;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(2.6);
        queue.offer(4.0);
        queue.offer(2.0);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}