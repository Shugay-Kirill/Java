import java.util.ArrayList;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

public class Task_2 {
    public static void main(String[] args) {
        int length = 5;
        ArrayList<Integer> arrayList = randomArrayList(length);
        printArrayList(arrayList);
        int maxNumber = 0;
        int minNumber = 20;
        int summ = 0;
        for (int i = 0; i < length; i++) {
            if (arrayList.get(i) > maxNumber)
                maxNumber = arrayList.get(i);
            if (arrayList.get(i) < minNumber)
                minNumber = arrayList.get(i);
            summ += arrayList.get(i);
        }
        System.out.printf("\nMax = %d\nMin = %d\nAvg = %.2f\n", maxNumber, minNumber, (float) summ / length);
    }

    static ArrayList<Integer> randomArrayList(int length) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            arrayList.add(random.nextInt(0, 20));
        }
        return arrayList;
    }

    static void printArrayList(ArrayList<Integer> array) {
        for (Object i : array) {
            System.out.printf("%d, ", i);
        }
    }

}
