package Singleton_Pattern;
public class Configuration {
    private static Configuration instance;

    private Configuration() {}

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public void loadConfig() {
        System.out.println("Loading config...");
    }
}
