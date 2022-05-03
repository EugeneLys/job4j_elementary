package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
        char[] temp = fio[1].toCharArray();
        char[] temp2 = fio[2].toCharArray();
        String result = fio[0] + " " + temp[0] + "." + temp2[0] + ".";
        return result;
    }
}
