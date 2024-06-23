package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        t = t >= 0 ? t : -t;
        int length = ("" + t).length();
        for (int i = 1; i <= length; i++) {
            sum = sum + t % 10;
            t = t / 10;
        }
        System.out.println(sum);
    }
}
