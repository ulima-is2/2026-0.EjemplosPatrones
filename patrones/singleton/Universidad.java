// Singleton
public class Universidad {
    private static Universidad instance = null;

    public static Universidad getInstance(){
        if (instance == null) {
            instance = new Universidad();
        }
        return instance;
    }

    private Universidad(){}
}
