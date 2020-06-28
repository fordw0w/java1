package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        // пример 362
        int n1= number%10; //2
        int n3 = number/10; // 36
        int n2 = n3%10; // 6
        int n4 = number/100;//3
Integer reverseIn1 = n1; // автоупаковка
Integer reverseIn2 = n2;
Integer reverseIn4 = n4;
String str1 = Integer.toString(n1); // перевод в строку
String str2 = Integer.toString(n2);
String str4 = Integer.toString(n4);
String str5 = str1 + str2 + str4;
int n5 = Integer.valueOf(str5); // перевод финального числа в int

        System.out.println(n5); // вывод на консоль (проверка)
        return n5; // возврат к функции
    }

    public static void main(String[] args) {
        reverseDigits(362);

    }
}

