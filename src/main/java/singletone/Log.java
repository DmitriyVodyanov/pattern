package singletone;

public class Log {
    private static Log instance;

    private Log() {
    }

    public static Log getInstance() {
        if (instance == null) {
            instance = new Log();
        }
        return instance;
    }

    public void printLog(Object ob) {
        System.out.printf("log info: %s \n", ob.getClass().getName().toString());
    }

    public void printLog(Object obOne, Object obTwo) {
        System.out.printf("log info: %s, %s \n", obOne.getClass().getName().toString(), obTwo.getClass().getName().toString());
    }

    public void printLog(Object ob, String message) {
        System.out.printf("log info: %s, %s \n", ob.getClass().getName().toString(), message);
    }
}
