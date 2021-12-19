package factory;

public class Esspresso extends Coffee {
	private static String type = "esspresso";
	@Override
	public String makeCoffee() {
		return "make esspresso";
	}

	public static String getType() {
		return type;
	}
}
