public class sumOfDivisors {
    public static void main(String[] args) {
        int N = 4;
        int result = divisorSum(N);
        System.out.println(result);
    }
    static int divisorSum(int n) {
        return divisorSumHelper(n, 1);
    }
    static int divisorSumHelper(int n, int i) {
        if (i > n) {
            return 0;
        }
        return (n / i) * i + divisorSumHelper(n, i + 1);
    }
}
