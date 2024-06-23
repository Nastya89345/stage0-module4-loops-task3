package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
//        int min = first < second ? first : second;
//        for (int i = min; i > 0; i--) {
//            if((first % i == 0) && (second % i == 0)){
//                System.out.println(i);
//                break;
//            }
//        }
        while(first > 0 && second > 0){
            if(first >= second){
                first -= second;
            }else {
                second -= first;
            }
        }
        System.out.println(first > second ? first : second);
    }
}
