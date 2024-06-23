package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for (int i = 1; i <= lengthOfLastNumber; i++) {
            int add = 0;
            for (int j = 0; j < i; j++) {
                add = add * 10  + 9;
            }
            sum += add;
        }
        System.out.println(sum);
    }
}
