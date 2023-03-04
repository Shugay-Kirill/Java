// 2. Написать метод, который определяет, является ли год високосным, и возвращает boolean 
// (високосный - true, не високосный - false). Каждый 4-й год является високосным, 
// кроме каждого 100-го, при этом каждый 400-й – високосный.

package Homework_1;

import java.util.Scanner;

public class Task_2{

    public static void main(String[] args) {
        int year = input_year(); 
        if (check_yaer(year)) System.out.println("Высокосный");
        else System.out.println("Не высокосный"); 
    }

    static int input_year(){
        System.out.println("Введите год: ");
        Scanner iScanner = new Scanner(System.in);
        int year = iScanner.nextInt();
        iScanner.close();
        return year;
    }

    static boolean check_yaer(int year){
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) return true;
        else return false;
    }
}