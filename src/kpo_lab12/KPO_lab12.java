package kpo_lab12;

import java.util.Scanner;

public class KPO_lab12 {

    static int summa;

    public static void main(String[] args) {
        String inputNum = inputNumber();
        sumNumber(inputNum);
    }
// Ввод чисел

    public static String inputNumber() {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        return str;
    }

    public static void sumNumber(String str) {
        int num;
        int mark;
        // Просмотр строки и преобразование её в числа
        while (str.length() != 0) {
            mark = str.indexOf(" ");
            if (mark == -1) {
                num = Integer.parseInt(str);
                str = "";
                //Подсчёт суммы чисел
                summa += num;
            } else {
                num = Integer.parseInt(str.substring(0, mark));
                str = str.substring(mark + 1);
                //Подсчёт суммы чисел
                summa += num;
            }
        }
        //Вывод суммы на консоль
        System.out.println("Сумма:" + summa);
    }
}
