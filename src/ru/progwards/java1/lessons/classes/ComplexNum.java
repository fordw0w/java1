package ru.progwards.java1.lessons.classes;

//Реализовать класс ComplexNum, реализующий операции в комплексных числах.
//        Напоминаем, что комплексное число записывается как z = a + bi,
//        где z это комплексное число, a действительная часть, b мнимая часть, i обозначение мнимой части.
//        a и b реализуем целыми числами

public class ComplexNum {

    private int a;
    private int b;
    private int z;
    private  int c;
    private  int d;

//3.1 конструктор
//    public ComplexNum(int a, int b), который инициализирует комплексное число
public ComplexNum(int a, int b) {
    this.a = a;
    this.b = b + a;


}


//3.2 метод
//    public String toString(), приведение к строке, выдать в формате a+bi,
//    например, при a=1 и b=56 должно быть выдано 1+56i

    public String toString(){
    return Integer.toString(a) + "+" + Integer.toString(b) + "i";
    }

//    public ComplexNum add(ComplexNum num), сложение комплексных чисел по формуле:
//    (a + bi) + (c + di) = (a + c) + (b + d)i
//          a           b

    public ComplexNum add(ComplexNum num) {
    int a1 = a + c; // целые
   int b1 = b + d; // мнимые


    return new ComplexNum(a1,b1);
    }
//    вычитание комплексных чисел по формуле:
//            (a + bi) - (c + di) = (a - c) + (b - d)i
    public ComplexNum sub(ComplexNum num) {
        a = a - c; // целые
        b = b - d; // мнимые
        z = a - b;
        return new ComplexNum(a,b);
    }
//    public ComplexNum mul(ComplexNum num), умножение комплексных чисел по формуле:
//            (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
public ComplexNum mul(ComplexNum num){
    a = a * c;
    b = b * d;
    return new ComplexNum(a,b);
}
//    public ComplexNum div(ComplexNum num), деление комплексных чисел по формуле:
//            (a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i

    public ComplexNum div(ComplexNum num){
    a = a * c / c * c;
    b = b * d / d * d;
        return new ComplexNum(a,b);
    }



}


