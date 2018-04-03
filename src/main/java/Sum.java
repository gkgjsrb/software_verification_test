public class Sum {

    public int sum(int sum1, int sum2) {
        return sum1 + sum2;
    }

    public int min(int min1, int min2) {
        return min1 - min2;
    }

    public int mul(int mul1, int mul2) {
        return mul1 * mul2;
    }

    public int div(int div1, int div2) {
        return div1 / div2;
    }


    public static void main(String[] args) {
        Sum sum = new Sum();
	int a = sum.sum(3, 4);
    }
}
