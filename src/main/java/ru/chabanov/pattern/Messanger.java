package ru.chabanov.pattern;

public class Messanger {
  public   EventManager events = new EventManager();

    public void sendNews(String typeNews, String news) {
        events.notify(typeNews, news);
    }

    public void unsubscribe(String typeNews) throws Exception {
            events.notify(typeNews, "null");

    }
}
