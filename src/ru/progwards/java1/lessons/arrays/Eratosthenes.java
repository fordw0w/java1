package ru.progwards.java1.lessons.arrays;

public class Eratosthenes {
//    для того, чтобы узнать, я является ли число n простым, нужно взять значение по индексу в массиве. sieve[n].
//    Значение true, означает простое число, false - составное.
int N = 20;
    private boolean[] sieve;

//    Конструктор который должен разместить массив sieve с размером в N и
//    заполнить его значениями true, после чего вызвать метод sift()

    public Eratosthenes(int N){
      this.sieve= new boolean[N];
//      this.sieve[N] = true;
        sift();
    }
//    МЕТОД который, собственно и реализует алгоритм Эратосфена, просеивая составные числа.
//        Подсказка - нужно реализовать 2 вложенных цикла, внешний,
//    например по i от 2 до N-1, и внутренний, например по j который будет просеивать числа, кратные переменной внешнего цикла i*j.
    private void sift(){
        for ( int i = 2; i < N - 1; i++){
            System.out.println(i);
            for ( int j = 1; j < i*j; i++) {

                System.out.println(j);
            }
        }


        }

//        public boolean isSimple(int n), который возвращает sieve[n], что бы можно было узнать, простое число n или составное
        public boolean isSimple(int n){
            return sieve[n];
        }


    public static void main(String[] args) {
Eratosthenes Era = new Eratosthenes(20);
        System.out.println(Era);
    }

}
