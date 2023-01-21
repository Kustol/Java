//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

package HomeWork_1;

import java.util.Arrays;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        CreateArray();
    }

    private static void CreateArray() {
        int[] arr = new int[25];
        Random random = new Random();
        int minValue = 0;
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(-50,50);
        }
        for (int i = 0; i < arr.length; i++) {
            minValue = Math.min(minValue, arr[i]);
            maxValue = Math.max(maxValue, arr[i]);

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
    }


