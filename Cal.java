class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    public int multiply(int n1, int n2) {
        return n1 * n2;
    }
    public int square(int n) {
        return n * n;
    }
}

public class Cal {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int step1 = calc.multiply(3, 4);
        int step2 = calc.multiply(5, 7);
        int sum1 = calc.add(step1, step2);
        int result1 = calc.square(sum1);
        System.out.println("Result 1: " + result1);

        int val1 = calc.square(calc.add(4, 7));
        int val2 = calc.square(calc.add(8, 3));
        int result2 = calc.add(val1, val2);
        System.out.println("Result 2: " + result2);
    }
}