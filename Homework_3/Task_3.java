import java.util.ArrayList;
import java.util.Scanner;

// Создать список типа ArrayList<String>. Поместить в него как строки, 
// так и целые числа. Пройти по списку, найти и удалить целые числа.

public class Task_3 {
    public static void main(String[] args) {
        ArrayList<String> arrayString = inputArray();
        printArrayList(arrayString);
        System.out.println();
        printArrayList(deleteIntegerOfArray(arrayString));
    }

    static ArrayList<String> inputArray() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayString = new ArrayList<String>();
        System.out.printf("Введите значение(для завершения нажмите ENTER): ");
        String inputString = scanner.nextLine();
        while (inputString != "") {
            arrayString.add(inputString);
            System.out.printf("Введите значение(для завершения нажмите ENTER): ");
            inputString = scanner.nextLine();
        }
        return arrayString;
    }

    static void printArrayList(ArrayList<String> array) {
        for (String imet : array) {
            System.out.printf("%s; ", imet);
        }
    }

    static ArrayList<String> deleteIntegerOfArray(ArrayList<String> array) {
        ArrayList<String> newArray = new ArrayList<String>();
        for (int i = 0; i < array.size(); i++) {
            try {
                Integer a = Integer.parseInt(array.get(i)); 
            } catch (NumberFormatException e) {
                newArray.add(array.get(i));
            }
        }
        return newArray;
    }
}
