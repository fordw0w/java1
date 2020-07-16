package ru.progwards.java1.lessons.classes;

public class Animal {
    public double weight;
    enum AnimalKind {
        ANIMAL,
        COW,
        HAMSTER,
        DUCK,
    }
    enum FoodKind {
        UNKNOWN,
        HAY,
        CORN,
    }

//1.0 Реализовать конструктор
//    public Animal(double weight), который сохраняет вес животного.
    public Animal(double weight){
this.weight = weight;
    }
//1.1 Метод:
//    public AnimalKind getKind(), который возвращает вид животного
//    (enum AnimalKind - ANIMAL, COW, HAMSTER, DUCK). В данном классе вернуть ANIMAL
    public AnimalKind getKind(){
        return AnimalKind.ANIMAL;
    }
//    public FoodKind getFoodKind(), который возвращает вид еды,
//    (enum FoodKind - UNKNOWN, HAY, CORN). В данном классе вернуть UNKNOWN
public FoodKind getFoodKind(){
        return FoodKind.UNKNOWN;
}

//    public String toString(), который возвращает информацию о животном в формате:
//    I am <AnimalKind>, eat <FoodKind>
public String toString(){
        return "I am " + getKind() + ", eat " + getFoodKind();
    }

//    public double getWeight(), который возвращает вес животного
public double getWeight() {
        return weight;
}
//    public double getFoodCoeff(), который возвращает коэффициент веса еды к весу тела животного.
//    Для класса Animal это 0.02
public double getFoodCoeff(){
return 0.02;
}
//    public double calculateFoodWeight(), который рассчитывает необходимый вес еды, по формуле
//    - вес-еды = вес-животного * коэффициент веса тела.
public double calculateFoodWeight(){
        double weightEat = getWeight() * getFoodCoeff();
        return weightEat;
}

//    public String toStringFull(), что бы он возвращал информацию о животном в формате:
//    I am <AnimalKind>, eat <FoodKind> <CalculateFoodWeight>

    public String toStringFull(){
     return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }
}
