package ru.chabanov.pattern;



public class EmailListener implements EventListener {
    private String email;

    public EmailListener(String email) {
        this.email = email;
    }

    @Override
    public void update( String news) {
        System.out.println( "На почту: " + email+" отправленна новость: "+news);
    }
}