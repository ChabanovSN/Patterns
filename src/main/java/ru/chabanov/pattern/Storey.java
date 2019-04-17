package ru.chabanov.pattern;

import java.util.HashMap;
import java.util.Map;

public class Storey {

    private Map<String, Integer> amountItems;


    public static class BuilderLevel {
        private int windows = 0;
        private int room = 0;
        private int door = 0;
        private Map<String, Integer> amountItems = new HashMap<>();

        public BuilderLevel setWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public BuilderLevel setRoom(int room) {
            this.room = room;
            return this;
        }

        public BuilderLevel setDoor(int door) {
            this.door = door;
            return this;
        }

        public Storey buildLevel() {
            amountItems.put("windows", windows);
            amountItems.put("rooms", room);
            amountItems.put("doors", door);
            return new Storey(amountItems);
        }
    }

    private Storey(Map<String, Integer> amountItems) {
        this.amountItems = amountItems;
    }

    public Map<String, Integer> getAmountItems() {
        return amountItems;
    }

    @Override
    public String toString() {
        return "Storey{" +
                "amountItems=" + amountItems +
                "}+\n";
    }
}
