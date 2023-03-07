// 1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

package Homework_2;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        String string = inputString();
        System.out.println(palindromeString(string));
    }

    static boolean palindromeString(String string){
        int lengthString = string.length();
        for (int i = 0; i < lengthString/2; i++) {
            if (string.charAt(i) != string.charAt(lengthString-i-1)) return false;
        }     
        return true;
    }

    static String inputString(){
        System.out.printf("Введите строчку проверки: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }
}
