package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int number = 0;
        int next = 1;
        for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(number);
            int previous = number;
            number = next;
            next += previous;
        }
    }
}
