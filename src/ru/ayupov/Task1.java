package ru.ayupov;

import java.util.Arrays;

/**
 * Дан двумерный массив. Задача – написать метод
 * public void toLeft() {} *
 * 1.Пройти с 1-ой до последней строки *
 * 2.Пройти с 1-го до предпоследнего элемента *
 * 3.В текущую ячейку поместить значение следующей *
 * 4.Последнему элементу присвоить 0
 */

public class Task1 {
    public static void main(String[] args) {
        int[][] arr = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        toLeft(arr);
    }

    public static void toLeft(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

            for (int j = 0; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i][j + 1];
            }
            arr[i][arr[i].length - 1] = 0;
            System.out.println(Arrays.toString(arr[i]));
            System.out.println();
        }

    }
}
