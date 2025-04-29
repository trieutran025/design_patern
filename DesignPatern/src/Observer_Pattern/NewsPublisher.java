package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class Subscriber implements Observer {
    private String name;
    public Subscriber(String name) {
        this.name = name;
    }
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class NewsPublisher {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer o) {
        observers.add(o);
    }

    public void notifyAll(String news) {
        for (Observer o : observers) {
            o.update(news);
        }
    }
}
