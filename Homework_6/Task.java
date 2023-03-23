// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков (ArrayList).
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. Например, спросить у пользователя 
// минимальный размер оперативной памяти или конкретный цвет. Выводить только те ноутбуки, что соответствуют условию

package Homework_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        ArrayList<Laptop> listLaptop = inputLaptop();
        System.out.println(listLaptop.toString());

        printRequest();
        int inputNumber = inputRequest();
        while (inputNumber < 1 && inputNumber > 3) {
            printRequest();
            System.out.println("Неправильный ввод. Введите значение 1, 2 или 3");
            inputNumber = inputRequest();
        }
        Scanner scanner = new Scanner(System.in);
        boolean chech = false;
        switch (inputNumber) {
            case 1:
                System.out.printf("Введите фирму ноутбука:");
                String nameLaptop = scanner.nextLine();
                for (var item : listLaptop) {
                    if (nameLaptop.equals(item.NameLaptop)){
                        System.out.println(item);
                        chech = true;
                    }
                }
                if (chech == false) System.out.println("Ничего нет по такому запросу =(");
                break;
            case 2:
                // Scanner scanner = new Scanner(System.in);
                System.out.printf("Введите цвет ноутбука:");
                String colorLaptop = scanner.nextLine();
                for (var item : listLaptop) {
                    if (colorLaptop.equals(item.colorLaptop)){
                        System.out.println(item);
                        chech = true;
                    }
                }
                if (chech == false) System.out.println("Ничего нет по такому запросу =(");
                break;
            case 3:
                System.out.printf("Введите цвет ноутбука:");
                Integer RAMLaptop = scanner.nextInt();
                for (var item : listLaptop) {
                    if (RAMLaptop.equals(item.RAMLaptop)){
                        System.out.println(item);
                        chech = true;
                    }
                }
                if (chech == false) System.out.println("Ничего нет по такому запросу =(");
                break;
        }
    }

    static ArrayList<Laptop> inputLaptop() {
        ArrayList<Laptop> listLaptop = new ArrayList<>();

        Laptop laptop1 = new Laptop();
        laptop1.NameLaptop = "hp";
        laptop1.RAMLaptop = 8;
        laptop1.colorLaptop = "black";

        Laptop laptop2 = new Laptop();
        laptop2.NameLaptop = "hp";
        laptop2.RAMLaptop = 16;
        laptop2.colorLaptop = "white";

        Laptop laptop3 = new Laptop();
        laptop3.NameLaptop = "lenovo";
        laptop3.RAMLaptop = 8;
        laptop3.colorLaptop = "black";

        Laptop laptop4 = new Laptop();
        laptop4.NameLaptop = "lenovo";
        laptop4.RAMLaptop = 32;
        laptop4.colorLaptop = "white";

        listLaptop.add(laptop1);
        listLaptop.add(laptop2);
        listLaptop.add(laptop3);
        listLaptop.add(laptop4);

        return listLaptop;
    }

    static int inputRequest() {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        return inputNumber;
    }

    static void printRequest() {
        System.out.printf("Выберите, что будем искать?" +
                "\n     1. Название фирмы ноутбука" +
                "\n     2. Цвет ноутбука" +
                "\n     3. ОЗУ ноутбука" +
                "\nВведите цифру:");
    }
}
