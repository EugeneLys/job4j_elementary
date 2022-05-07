package ru.job4j.array;

public class RightShift {

    public static void shift(int[] nums, int count) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i < count) {
                temp[i] = nums[nums.length - (count - i)];
            } else {
                temp[i] = nums[i - count];
            }
        }
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }

    private static void shift(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i < 1) {
                temp[i] = nums[nums.length - 1];
            } else {
                temp[i] = nums[i - 1];
            }
        }
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }
}