public class task1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int sum(int lastNumber) {
        int sum = 0;
        for (int i = 1; i <=lastNumber; i++){
            sum+=i;
        }
        return sum;
    }
}
