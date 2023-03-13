import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, 
// удалить из него четные числа (в языке уже есть что-то готовое для этого)

public class Task_1 {

    public static void main(String[] args) {
        int length = 10;
        int[] array = randomArray(length);
        printArray(array);
        ArrayList<Integer> newArrayNumbers = evenNumbers(array);
        System.out.println();
        printArrayList(newArrayNumbers);
    }

    static int[] randomArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 20);
        }
        return array;
    }

    static ArrayList<Integer> evenNumbers(int[] arrayNumbers) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int item : arrayNumbers) {
            if (item % 2 != 0)
                newArray.add(item);
        }
        return newArray;
    }

    static void printArray(int[] array) {
        for (int i : array) {
            System.out.printf("%d, ", i);
        }
    }

    static void printArrayList(ArrayList<Integer> array) {
        for (Object i : array) {
            System.out.printf("%d, ", i);
        }
    }
}