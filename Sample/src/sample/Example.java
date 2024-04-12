package sample;

public class Example {
    public static void main(String[] args) {
        var number1 = 100;
        var number2 = 10;

        sumMethod1(number2, number1);
    }

    public static void sumMethod1(int num1, int num2) {
        var result = num1 + num2;
        System.out.println("sumMethod1の結果は" + num1);
    }
}
