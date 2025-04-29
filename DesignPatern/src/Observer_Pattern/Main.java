package Observer_Pattern;

public class Main {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();
        publisher.subscribe(new Subscriber("Alice"));
        publisher.subscribe(new Subscriber("Bob"));
        publisher.notifyAll("New article released!");
    }
}
