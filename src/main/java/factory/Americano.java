package factory;

public class Americano extends Coffee {
	private static String type = "americano";
	@Override
	public String makeCoffee() {
		return "make americano";
	}

	public static String getType() {
		return type;
	}
}
