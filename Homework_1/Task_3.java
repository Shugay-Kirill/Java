// 3. Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести 
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива 
// должны быть отличны от заданного, а остальные - равны ему.

package Homework_1;

import java.util.Random;
import java.util.Scanner;
import Homework_1.Task_1;

public class Task_3 {

    public static void main(String[] args) {
        int value = desired_number();
        int length_array = input_length_array();
        int [] array_number = random_array(length_array);
        Homework_1.Task_1.print_array(array_number);
        int [] new_array_number = check_value(array_number, value);
        Homework_1.Task_1.print_array(new_array_number);
        
    }

    static int[] random_array (int length_array){
        Random random = new Random();
        int[] array_number = new int[length_array];
        for (int i = 0; i < array_number.length; i++) {
            array_number[i] = random.nextInt(0,10);
        }
        return array_number;
    }

    static int[] check_value(int[] array_number, int value){ 
        for (int i = 0; i < array_number.length-1; i++) {
            for (int j = 0; j < array_number.length-i-1; j++) {
                if (array_number[j] == value){
                    int temp = array_number[j];
                    array_number[j] = array_number[j+1];
                    array_number[j+1] = temp;
                }   
            }
        }
        return array_number;
        
    }

    static int desired_number(){
        System.out.printf("Введите число поиска: ");
        Scanner iScanner = new Scanner(System.in);
        int value = iScanner.nextInt();
        return value;
    }

    static int input_length_array() {
        System.out.printf("Введите длину масcива числе: ");
        Scanner iScanner = new Scanner(System.in);
        int length_array = iScanner.nextInt();
        return length_array;
    }
}
