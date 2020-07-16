package ru.progwards.java1.lessons.classes;
//Реализовать класс ComplexNum, реализующий операции в комплексных числах.
//        Напоминаем, что комплексное число записывается как z = a + bi,
//        где z это комплексное число, a действительная часть, b мнимая часть, i обозначение мнимой части.
//        a и b реализуем целыми числами

public class ComplexNum {
private int a;
private int b;


//    3.1 конструктор
//    public ComplexNum(int a, int b), который инициализирует комплексное число

    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;

    }


//    public String toString(), приведение к строке, выдать в формате a+bi,
//    например, при a=1 и b=56 должно быть выдано 1+56i
public String toString() {
    if (a == 0)
        return b + "";
    if (b == 0)
        return a + "i";
    if (a <  0)
        return b + " - " + (-b) + "i";
    return a + " + " + b + "i";
}
//3.3 метод
//    public ComplexNum add(ComplexNum num), сложение комплексных чисел по формуле:
//            (a + bi) + (c + di) = (a + c) + (b + d)i

}

