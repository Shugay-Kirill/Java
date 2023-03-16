import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

// 1. Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

// package Homework_4;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<String> stringArray = inputArray();
        System.out.println(stringArray.toString());
        ////
        int i = 0;
        while (i < stringArray.size()) {
            String[] stringCheck = stringArray.get(i).split(" ");
            for (String item : stringCheck) {
                switch (item) {
                    case "print":
                        printSting(stringArray);
                    case "revert":
                        if (i != 0)
                            stringArray.remove(i - 1);
                    default:
                        break;
                }
            }

            i += 1;
        }
        System.out.println(stringArray.toString());
    }

    static LinkedList<String> inputArray() {
        LinkedList<String> arrayString = new LinkedList<>();
        System.out.printf("Введите строчку(для завершения нажмите ENTER): ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        arrayString.add(inputString);
        while (inputString != "") {
            System.out.printf("Введите строчку(для завершения нажмите ENTER): ");
            inputString = scanner.nextLine();
            if (inputString != "")
                arrayString.add(inputString);
        }
        return arrayString;
    }

    static void printSting(LinkedList<String> arrayStrings) {
        System.out.printf(arrayStrings.get(arrayStrings.size() - 1)+ " ;");
        for (int i = 1; i < arrayStrings.size() - 1; i++) {
            System.out.printf(arrayStrings.get(i) + " ;");
        }
        System.out.printf(arrayStrings.get(0)+ " ;");
        System.out.println();
    }
}
