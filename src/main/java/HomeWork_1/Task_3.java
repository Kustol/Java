//3. Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
package HomeWork_1;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;


public class Task_3 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3, 4, 5, 10, 3};
        int value = 3;
        System.out.printf("Specified array: ");
        System.out.println(Arrays.toString(arr));
        int [] new_array = SortValArray(arr, value);
        System.out.printf("Sorted array: ");
        System.out.println(Arrays.toString(new_array));
    }


    private static int[] SortValArray(int[] arr, int value) {
        int leftIn = 0;
        int rightIn = arr.length - 1;
        while (leftIn < rightIn) {
            while (leftIn < rightIn && arr[rightIn] == value)
                rightIn--;

            if (arr[leftIn] == value)
                swap(arr, leftIn, rightIn);
            leftIn++;
        }
        return arr;
    }

    private static int[] swap(int [] arr, int leftIn, int rightIn) {
        int temp = arr[leftIn];
        arr[leftIn] = arr[rightIn];
        arr[rightIn] = temp;
        return arr;
    }
}

