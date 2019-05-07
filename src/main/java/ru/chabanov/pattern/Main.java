package ru.chabanov.pattern;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<String> list = Arrays.asList("Новости о погоде", "Новости о работе");

    public static void main(String[] args) {
        Messanger messanger = new Messanger();
        // добавляем тип новость
          messanger.events.addNews(list.get(0));
          messanger.events.addNews(list.get(1));
        // подписчики
        messanger.events.subscribe(list.get(0), new VKListener("Login1"));
        messanger.events.subscribe(list.get(1), new VKListener("Login1"));
        messanger.events.subscribe(list.get(1), new EmailListener("example@mail.ru"));
      // рассылаем  новую новость подписчикам
        messanger.sendNews(list.get(0),"Сегодня хорошая погода");
        messanger.sendNews(list.get(1),"Рынок вакансий ждет тебя");

      //  Вывод:
//        Пользователю Login1 отпарвленна новость:Сегодня хорошая погода
//        Пользователю Login1 отпарвленна новость:Рынок вакансий ждет тебя
//        На почту: example@mail.ru отправленна новость: Рынок вакансий ждет тебя


    }
}