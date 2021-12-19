package proxy;

public class TestProxy {
	public static void main(String[] args) {
		DataBase dataBase = new DataBase();
		ConnectDataBase connectDataBase = new ConnectDataBase(dataBase);
		System.out.println(connectDataBase.connectDb());
	}
}
