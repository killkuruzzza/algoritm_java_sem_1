import java.util.Date;

public class task6 {

    public static void main(String[] args) {
        test();
    }
    public static int fbLine(int num) {
        if (num <= 2) {
            return 1;
        } else {
            final int[] numbers = new int[num];
            numbers[0] = 1;
            numbers[1] = 1;
            for (int i = 2; i < numbers.length; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }
            return numbers[num - 1];
        }
    }

    public static int fbRecursive(int num) {
        if (num <= 2) {
            return 1;
        } else {
            return fbRecursive(num-1) + fbRecursive(num-2);
        }
    }

    public static void test() {
        for (int i = 10; i <= 100; i = i + 10) {
            Date startDate = new Date();
            fbLine(i);
            Date endDate = new Date();
            long lineDuration = endDate.getTime() - startDate.getTime();
            startDate = new Date();
            fbRecursive(i);
            endDate = new Date();
            long recursiveDuration = endDate.getTime() - startDate.getTime();
            System.out.printf("i: %s, line duration: %s, recursive duration: %s%n", i, lineDuration, recursiveDuration);
        }
    }
}
