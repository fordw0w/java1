package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {

    Cow(double weight) {
        super(weight);
    }
    @Override
    public AnimalKind getKind() {
        return AnimalKind.COW;
    }
    @Override
    public FoodKind getFoodKind(){
        return FoodKind.HAY;
    }
@Override

//2.3 Для класса Cow, переопределить метод:
//    public double getFoodCoeff(), который должен возвращать 0.05
    public double getFoodCoeff() {
    return 0.05;
}
}
