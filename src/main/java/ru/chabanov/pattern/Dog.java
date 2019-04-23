package ru.chabanov.pattern;

public class Dog implements Dogable {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void bark() {
        System.out.println("Пес "+name+" может лаять");
    }

    @Override
    public void guard() {
        System.out.println("Пес "+name+" может охранять");
    }
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
