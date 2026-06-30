
public class Logger {

    private static Logger instance = new Logger();

    private Logger() {
        System.out.println("Object Created");
    }

    public static Logger getInstance() {
        return instance;
    }

}