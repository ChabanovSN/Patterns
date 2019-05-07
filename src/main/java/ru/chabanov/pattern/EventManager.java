package ru.chabanov.pattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
   private   Map<String, List<EventListener>> listeners = new HashMap<>();


    public void addNews(String news){
        this.listeners.put(news, new ArrayList<>());
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, String news) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update( news);
        }
    }
}