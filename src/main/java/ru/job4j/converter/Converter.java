package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float income = 140;
        float euro = Converter.rubleToEuro(income);
        float expected1 = 2f;
        boolean passed1 = expected1 == euro;
        float dollar = Converter.rubleToDollar(income);
        float expexted2 = 2.3333333f;
        boolean passed2 = expexted2 == dollar;
        System.out.println("140 rubles are " + euro + " euro. Test result: " + passed1);
        System.out.println("140 rubles are " + dollar + " dollar. Test result: " + passed2);
    }
}
