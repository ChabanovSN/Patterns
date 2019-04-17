package ru.chabanov.pattern;



import java.util.HashMap;
import java.util.Map;

public class SweetHome {
    private String basement;
    private String roof;

    private Map<Integer, Storey> levels = new HashMap<>();



    public void setLevels(Map<Integer, Storey> levels) {
        this.levels = levels;
    }

    private SweetHome() {
        this.roof = "roof";
        this.basement = "basement";
    }

    public static class Builder {

        private Map<Integer, Storey> levelsBuilder = new HashMap<>();
        private int number_of_level = 1;


        public Builder setLevel(Storey storey) {
            this.levelsBuilder.put(number_of_level++, storey);

            return this;
        }


        public  SweetHome build() {
            SweetHome sweetHome = new SweetHome();
            sweetHome.setLevels(levelsBuilder);
            return sweetHome;
        }

    }
    public Map<Integer, Storey> getLevels() {
        return levels;
    }
    public String getBasement() {
        return basement;
    }

    public String getRoof() {
        return roof;
    }

    @Override
    public String toString() {
        return "SweetHome{" +
                "basement='" + basement + '\'' +
                ", roof='" + roof + '\'' +
                ", levels=\n" + levels +
                '}';
    }
}
