import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 2. Пусть дан список сотрудников:
// Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков
// Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова
// Анна Владимирова Иван Мечников Петр Петин Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<String> userList = listUser();
        ArrayList<String> userNameList = userNameList = listName(userList);
        Map<String, Integer> dictionaryUserName = new HashMap<String, Integer>();
        for (String item : userNameList) {
            if (dictionaryUserName.containsKey(item) == false) dictionaryUserName.putIfAbsent(item, 1);
            else dictionaryUserName.put(item, dictionaryUserName.get(item) + 1);
        }
        System.out.println(dictionaryUserName);
    }

    static ArrayList<String> listUser() {
        ArrayList<String> ListUserName = new ArrayList<>();
        ListUserName.add("Иван Иванов");
        ListUserName.add("Светлана Петрова");
        ListUserName.add("Кристина Белова");
        ListUserName.add("Анна Мусина");
        ListUserName.add("Анна Крутова");
        ListUserName.add("Иван Юрин");
        ListUserName.add("Петр Лыков");
        ListUserName.add("Марина Светлова");
        ListUserName.add("Мария Федорова");
        ListUserName.add("Мария Савина");
        ListUserName.add("Марина Лугова");
        ListUserName.add("Анна Владимирова");
        ListUserName.add("Иван Мечников");
        ListUserName.add("Петр Петин");
        ListUserName.add("Иван Ежов");
        return ListUserName;
    }

    static ArrayList<String> listName(ArrayList<String> listUser){
        ArrayList<String> listName = new ArrayList<String>();
        for (int i = 0; i < listUser.size(); i++) {
            String [] recordNameUser = listUser.get(i).split(" ");
            listName.add(recordNameUser[0]);
        }
        return listName;
    }

}
