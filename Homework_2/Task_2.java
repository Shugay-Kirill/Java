// 2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и
//  метод, который запишет эту строку в простой текстовый файл, обработайте исключения.


package Homework_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int length = inputLengthArray();
        String text = inputText();
        String[] arrayString = addArray(text, length);
        fillingFile(arrayString);
    }

    static void fillingFile(String[] strArray){
        try (FileWriter fw = new FileWriter("Text.txt", false)){
            for (int i = 0; i < strArray.length; i++) {
                fw.append(strArray[i] + "\n");
            }
            fw.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    static String[] addArray(String str, int lengthArray){
        String array[] = new String[lengthArray];
        for (int i = 0; i < lengthArray; i++) {
            array[i] = str;
        }
        return array;
    }
    
    static int inputLengthArray(){
        System.out.printf("Введите длинну массива: ");
        Scanner scanner = new Scanner(System.in); 
        int lengthArray = scanner.nextInt();
        return lengthArray;
    }

    static String inputText(){
        System.out.printf("Введите слово: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text; 
    }
}
