package factory;

public class TestCoffeeCreator {
	public static void main(String[] args) {
		Coffee americano = CoffeeCreator.getCoffee("americano");
		Coffee espresso = CoffeeCreator.getCoffee("esspresso");
		System.out.println(americano instanceof Americano);
		System.out.println(americano.makeCoffee());
		System.out.println(espresso instanceof Esspresso);
	}
}
