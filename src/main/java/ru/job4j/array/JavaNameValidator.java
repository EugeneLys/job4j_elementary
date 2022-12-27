package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        if (!isLowerLatinLetter(name.charAt(0))) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (!isSpecialSymbol(c)
                    && !isUpperLatinLetter(c)
                    && !isLowerLatinLetter(c)
                    && !Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code > 64 && code < 91;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code > 96 && code < 123;
    }
}
