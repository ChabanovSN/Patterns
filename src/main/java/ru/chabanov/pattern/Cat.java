package ru.chabanov.pattern;

public class Cat implements Catable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void mew() {
        System.out.println("Кот " +name+ " может мяукать");
    }

    @Override
    public void climb() {
        System.out.println("Кот " +name+ " может лазить по деревьям");
    }
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
