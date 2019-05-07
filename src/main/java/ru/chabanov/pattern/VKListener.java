package ru.chabanov.pattern;

public class VKListener implements EventListener {
    private String log;

    public VKListener(String loggin) {
        this.log = loggin;
    }

    @Override
    public void update( String news) {
        System.out.println( "Пользователю "+log+ " отпарвленна новость:" +news);
    }
}