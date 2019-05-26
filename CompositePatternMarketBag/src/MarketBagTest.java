
public class MarketBagTest {
	public static void main(String[] args) {

		Vegetable vegetable1 = new Vegetable();
		Vegetable vegetable2 = new Vegetable();
		Vegetable vegetable3 = new Vegetable();
		Vegetable vegetable4 = new Vegetable();
		
		Fruit fruit1 = new Fruit();

		CompositeMarketBag marketbag1 = new CompositeMarketBag();
		marketbag1.add(vegetable1);
		marketbag1.add(vegetable2);
		marketbag1.add(vegetable3);
		marketbag1.add(fruit1);

		CompositeMarketBag marketbag2 = new CompositeMarketBag();
		marketbag2.add(vegetable4);
		

		CompositeMarketBag marketbag3 = new CompositeMarketBag();
		marketbag1.add(marketbag2);
		marketbag1.add(marketbag3);

		marketbag1.add();
	}
}