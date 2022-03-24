package ru.job4j.calculator;

public class MathFunc {

    public static int func1(int x) {
        //int y = x * x + 1;
        //убрал переменную y, так как выдается ошибка "local variable is redundant"
        return x * x + 1;
    }

    public static int func2(int x) {
        //int y = 1 / x;
        // убрал переменную y, так как выдается ошибка "local variable is redundant"
        return 1 / x;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(3);
        int result2 = MathFunc.func2(5);
        int result3 = MathFunc.func1(100); //solution
        int total = result1 + result2;
        System.out.println(total);
    }
}