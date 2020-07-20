package ru.progwards.java1.lessons.classes;
public class ComplexNum {
    final private int a;
   final private int b;
//3.1 конструктор
//    public ComplexNum(int a, int b), который инициализирует комплексное число
public ComplexNum(int a, int b) {
    this.a = a;
    this.b = b;
}
//3.2 метод
//    public String toString(), приведение к строке, выдать в формате a+bi,
//    например, при a=1 и b=56 должно быть выдано 1+56i
    public String toString(){
    return Integer.toString(a) + "+" + Integer.toString(b) + "i";
    }

//    public ComplexNum add(ComplexNum num), сложение комплексных чисел по формуле:
//    (a + bi) + (c + di) = (a + c) + (b + d)i
//        a          b
    public ComplexNum add(ComplexNum num) {
ComplexNum a1 = this;
    int a = a1.a + num.a; // целые
 int b = a1.b + num.b; // мнимые
//        a = a + c; // целые
//        b = b + d; //
    return new ComplexNum(a,b);
    }

//    вычитание комплексных чисел по формуле:
//            (a + bi) - (c + di) = (a - c) + (b - d)i
    public ComplexNum sub(ComplexNum num) {
        int a = this.a - num.a; // целые
        int b = this.b - num.b; // мнимые
        return new ComplexNum(a,b);
    }
//    public ComplexNum mul(ComplexNum num), умножение комплексных чисел по формуле:
//            (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i =ac - bd
public ComplexNum mul(ComplexNum num){
    int a = (this.a * num.a) - (this.b * num.b);
    int b = (this.b * num.a) + (this.a * num.b);
    return new ComplexNum(a,b);
}
//    public ComplexNum div(ComplexNum num), деление комплексных чисел по формуле:
//            (a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
    public ComplexNum div(ComplexNum num){
        int i = (num.a * num.a + num.b * num.b);
        int a = (this.a * num.a + this.b * num.b) / i;
        int b = (this.b * num.a - this.a * num.b) / i;
////        int a = (this.a * num.a + num.b * num.b) / i;
//        int a = (this.a* num.a) + (this.a* num.b) + (b* num.a) - (b * num.b);

//   int b = (this.b * num.a - this.a * num.b) / i;
        return new ComplexNum(a,b);
    }

}


