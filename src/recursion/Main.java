package recursion;

public class Main {
    public static void main(String[] args){

        walk(10);
    }

    private static void walk(int steps) {

        if(steps < 1) return;// base case
        System.out.println("You take a step!");
        walk(steps-1);// recursive case
    }
}
