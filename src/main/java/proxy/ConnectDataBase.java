package proxy;

public class ConnectDataBase {
	private String nameDb = "/namedb";
	private String port = ":port";
	private String url = "localhost";
	private DataBase db;

	public ConnectDataBase(DataBase db) {
		this.db = db;
	}

	public StringBuilder connectDb() {
		StringBuilder uri = new StringBuilder("подключено ");
		uri.append(url);
		uri.append(port);
		uri.append(nameDb);
		return uri;

	}
}
