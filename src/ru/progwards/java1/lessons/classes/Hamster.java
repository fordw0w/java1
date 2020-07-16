package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {

    Hamster(double weight) {
        super(weight);
    }
    @Override
    public AnimalKind getKind(){
        return AnimalKind.HAMSTER;
    }
    @Override
            public FoodKind getFoodKind(){
        return FoodKind.CORN;
            }
//    public double getFoodCoeff(), который должен возвращать 0.03
    @Override
    public double getFoodCoeff(){
        return 0.03;
    }
}