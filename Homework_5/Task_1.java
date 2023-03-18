import java.util.HashMap;

// 1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> db = new HashMap<String, ArrayList<String>>();
        db = inputMap();
        printDictionary(db);
    }

    static void printDictionary(Map<String, ArrayList<String>> dictionary) {
        for (var item : dictionary.entrySet()) {
            System.out.printf("[%s: %s]\n", item.getKey(), item.getValue());
        }
    }

    static Map<String, ArrayList<String>> inputMap() {
        Map<String, ArrayList<String>> dictionary = new HashMap<String, ArrayList<String>>();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> PhoneUserList = new ArrayList<>();
        System.out.printf("Введите имя пользователя: ");
        String UserName = scanner.nextLine();
        System.out.printf("Ввидете номер телефона пользователя(Для завершения нажмите ENTER): ");
        String PhoneUser = scanner.nextLine();
        PhoneUserList.add(PhoneUser);
        while (PhoneUser != "") {
            System.out.printf("Ввидете номер телефона пользователя(Для завершения нажмите ENTER): ");
            PhoneUser = scanner.nextLine();
            if (PhoneUser != "")
                PhoneUserList.add(PhoneUser);
        }
        dictionary.put(UserName, PhoneUserList);
        return dictionary;
    }

}