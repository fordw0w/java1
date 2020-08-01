package ru.progwards.java1.lessons.compare_if_cycles;

import java.util.Arrays;

public class summAr {
    //    Напишите функцию, суммирующие значения элементов одномерного массива, содержащего целые числа. Сигнатура:
//    public int sumArrayItems(int[] a)
    public static int sumArrayItems(int[] a) {
//        int a3 = 0;
////        a3  = a[0];
//        int a1 = a[0];
//        int a2 = a[1];
//        int a4 = a[2];
//        int sum[] = new int[a.length];
//
//if (a.length == 0)
//
//for (int i = 0; i < a.length; i++) {
//
//    a3 = (a1 + a2);
//    a1 = a3;
//    a2 = ++a2;// значения который будут меняться и подставляться в формулу
//
//
////    System.out.println(a1);
//    System.out.println(a3);
////    System.out.println(a1);
//}
//    return a3;
//}
//return 0;
//        }

//

        int sum=0;
        for(int i=0; i<a.length; i++) {
            sum=sum+a[i];
            System.out.println(sum);
        }
        System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        int[] a = {2,2};

       sumArrayItems(a);
    }
}
