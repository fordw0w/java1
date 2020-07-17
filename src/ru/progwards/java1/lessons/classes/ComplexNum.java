package ru.progwards.java1.lessons.classes;

//Реализовать класс ComplexNum, реализующий операции в комплексных числах.
//        Напоминаем, что комплексное число записывается как z = a + bi,
//        где z это комплексное число, a действительная часть, b мнимая часть, i обозначение мнимой части.
//        a и b реализуем целыми числами

public class ComplexNum {
private int a;
private int c;
private int d;
private int b;
private int bi = b;
private int i;
private int di = d;

// z - комплексное число
    private int z;
//    i * i = -1
//    z = a + bi,


//    3.1 конструктор
//    public ComplexNum(int a, int b), который инициализирует комплексное число

    public ComplexNum(int a, int b) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
        this.z = a + b;


    }

//    public String toString(), приведение к строке, выдать в формате a+bi,
//    например, при a=1 и b=56 должно быть выдано 1+56i
public String toString() {
    if (a == 0)
        return b + "";
    if (b == 0)
        return a + "i";
    if (a <  0)
        return b + "-" + (-b) + "i";
    return a + "+" + b + "i";
}

//3.3 метод
//    public ComplexNum add(ComplexNum num), сложение комплексных чисел по формуле:
//            (a + bi) + (c + di) = (a + c) + (b + d)i
public ComplexNum add(ComplexNum num) {
int a1 = (a + bi) + (c + di);
    int b1 = (a + c) + (b + d) + i;

    return new ComplexNum(a1,b1);


}
//    public ComplexNum sub(ComplexNum num), вычитание комплексных чисел по формуле:
//            (a + bi) - (c + di) = (a - c) + (b - d)i
public ComplexNum sub(ComplexNum num) {
        int a1 =  (a + b) - (c + d);
        int a2 = (a - c) + (b - d) +i;
    if (i + i == -1)
        if (a1 == a2)
            return new ComplexNum(a1,a2);

    return num;
}
//    public ComplexNum mul(ComplexNum num), умножение комплексных чисел по формуле:
//            (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
public ComplexNum mul(ComplexNum num){
    int a1 =  (a + b) * (c + d);
    int a2 = (a*c - b*d) + (b*c + a*d) * i;
    if (i + i == -1)
        if (a1 == a2)
            return new ComplexNum(a1,a2);

    return num;
}
//    public ComplexNum div(ComplexNum num), деление комплексных чисел по формуле:
//            (a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
public ComplexNum div(ComplexNum num){
    int a1 =   (a + b) / (c + d);
    int a2 = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d)) *i;
    if (i + i == -1)
        if (a1 == a2)
            return new ComplexNum(a1,a2);

    return num;
}



}

