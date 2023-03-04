// 1. Задать одномерный массив и найти в нем 
// минимальный и максимальный элементы

package Homework_1;

import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        int k = input_length_array();
        int[] array_number = creation_array(k);
        print_array(array_number);
        int[] max_min = max_min(array_number);
        System.out.printf("Max = %d; Min = %d;", max_min[0], max_min[1]);
    }

    static int[] creation_array(int length_array) {
        Random random = new Random();
        int[] array_number = new int[length_array];
        for (int i = 0; i < array_number.length; i++) {
            array_number[i] = random.nextInt(0, 100);
        }
        return array_number;
    }

    static void print_array(int[] array_number) {
        for (int item: array_number) 
            System.out.printf("%d, ", item);
        System.out.println();
    }

    static int input_length_array() {
        System.out.printf("Введите длину масcива числе: ");
        Scanner iScanner = new Scanner(System.in);
        int length_array = iScanner.nextInt();
        iScanner.close();
        return length_array;
    }

    static int[] max_min(int[] array_number) {
        int[] max_min = new int[2];
        max_min[0] = 0; // max
        max_min[1] = 101; // min

        for (int i = 0; i < array_number.length; i++) {
            if (max_min[0] < array_number[i])
                max_min[0] = array_number[i];
            else if (max_min[1] > array_number[i])
                max_min[1] = array_number[i];
        }
        return max_min;
    }
}