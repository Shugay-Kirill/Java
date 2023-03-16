import java.util.LinkedList;
import java.util.Scanner;

// 2. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<String> stringArray = inputArray();
        System.out.println(stringArray.toString());
        LinkedList<String> newArrayString = revertArray(stringArray);
        System.out.println(newArrayString.toString());
    }

    static LinkedList<String> inputArray() {
        LinkedList<String> arrayStrings = new LinkedList<>();
        System.out.printf("Введите строчку(для завершения нажмите ENTER): ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        arrayStrings.add(inputString);
        while (inputString != "") {
            System.out.printf("Введите строчку(для завершения нажмите ENTER): ");
            inputString = scanner.nextLine();
            if (inputString != "")
                arrayStrings.add(inputString);
        }
        return arrayStrings;
    }

    static LinkedList<String> revertArray(LinkedList<String> arrayStrings) {
        LinkedList<String> newArraylist = new LinkedList<>();
        for (int i = 0; i < arrayStrings.size(); i++) {
            newArraylist.add(arrayStrings.get(arrayStrings.size() - i-1));
        }
        return newArraylist;
    }
}
