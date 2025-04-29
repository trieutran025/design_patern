package Singleton_Pattern;

public class Main {
    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();
        config.loadConfig();
    }
}