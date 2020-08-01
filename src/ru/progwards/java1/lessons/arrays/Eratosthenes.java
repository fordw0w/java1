package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
//    для того, чтобы узнать, я является ли число n простым, нужно взять значение по индексу в массиве. sieve[n].
//    Значение true, означает простое число, false - составное.

    private boolean[] sieve;

//    Конструктор который должен разместить массив sieve с размером в N и
//    заполнить его значениями true, после чего вызвать метод sift()

    public Eratosthenes(int N){
        Arrays.fill(sieve,true);
        sieve[1] = false;
        sift();
    }
//    МЕТОД который, собственно и реализует алгоритм Эратосфена, просеивая составные числа.
//        Подсказка - нужно реализовать 2 вложенных цикла, внешний,
//    например по i от 2 до N-1, и внутренний, например по j который будет просеивать числа, кратные переменной внешнего цикла i*j.
    private void sift() {
        int N = 20;
        for (int i=2; i*i < N; i++)
            if (sieve[i])
                for (int j=i*i; j <N; j+=i)
                    sieve[j] = false;
    }

//        public boolean isSimple(int n), который возвращает sieve[n], что бы можно было узнать, простое число n или составное
        public boolean isSimple(int n){
            return sieve[n];
        }


    public static void main(String[] args) {



    }

}
