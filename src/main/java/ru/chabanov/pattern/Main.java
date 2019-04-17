package ru.chabanov.pattern;

public class Main {
    public static void main(String[] args) {
        SweetHome sweetHome =   new SweetHome.Builder()
                .setLevel( new Storey.BuilderLevel()
                                     .setRoom(2)
                                     .setWindows(3)
                                     .setDoor(2)
                                     .buildLevel())
                .setLevel( new Storey.BuilderLevel()
                                     .setRoom(3)
                                     .setWindows(6)
                                      .setDoor(3)
                                      .buildLevel())
                .build();
        System.out.println(sweetHome);
    }
}
