package factory;

public class CoffeeCreator {
	public static Coffee getCoffee(String type){
		if(Americano.getType().equalsIgnoreCase(type)) {
			return new Americano();
		}
		else if(Esspresso.getType().equalsIgnoreCase(type)) {
			return new Esspresso();
		}
		return null;
	}
}
