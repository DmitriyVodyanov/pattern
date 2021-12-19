package singletone;

public class MainLog {
    public static void main(String[] args) {
        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass();
        Log log = Log.getInstance();
        log.printLog(firstClass);
        log.printLog(firstClass, secondClass);
        log.printLog(firstClass, "message");
    }
}
