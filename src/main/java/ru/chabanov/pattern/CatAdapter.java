package ru.chabanov.pattern;

public class CatAdapter implements Catable {
    private String name;

    private Dogable dog;

    public CatAdapter(Dogable dog) {
        this.dog = dog;
        this.name = "Кот мутант "+dog.getName()+" он же -" ;
    }

    @Override
    public void mew() {
        System.out.print(name);
        dog.bark();
    }

    @Override
    public void climb() {
        System.out.print(name);
        dog.bark();
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
