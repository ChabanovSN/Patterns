package ru.chabanov.pattern;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        cat.climb();
        cat.mew();
        Dog dog = new Dog("Бобик");
        dog.bark();
        dog.guard();
        CatAdapter mutant = new CatAdapter(dog);
        mutant.climb();
        mutant.mew();

//        Кот Барсик может лазить по деревьям
//        Кот Барсик может мяукать
//        Пес Бобик может лаять
//        Пес Бобик может охранять
//        Кот мутант Бобик он же -Пес Бобик может лаять
//        Кот мутант Бобик он же -Пес Бобик может лаять
    }
}
