package ru.progwards.java1.lessons.arrays;
import java.util.Arrays;
public class ArraySort {
//    Обобщая, алгоритм звучит следующим образом - сделать 2 вложенных цикла, внешний по i и внутренний по j.
//    Внутренний цикл начинается от i+1, и если a[i] > a[j], то нужно поменять элементы a[i] и a[j] местами.
    public static void sort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < i; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[j];
                    a[j] = a[i];
                }

            }

        }

    }
    public static void main(String[] args) {
        int[] a = {8,25,7,2,1};

        sort(a);


    }
}
