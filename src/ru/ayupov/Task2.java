package ru.ayupov;

import java.util.Arrays;

/**
 * Задача: Имеется массив, нужно переставить элементы массива в обратном порядке. *
 * Задачу не зачитывать если использованы утильные методы класса Arrays.
 * Решением также не являются манупуляции с выводом массива. Необходимо действительно перемещать элементы. *
 * Вывести массив в консоль до и после вызова метода по реверсу массива
 */

public class Task2 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length / 2; i++) {
            int lastElementId = arr.length - 1 - i;
            int temp = arr[i];
            arr[i] = arr[lastElementId];
            arr[lastElementId] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
