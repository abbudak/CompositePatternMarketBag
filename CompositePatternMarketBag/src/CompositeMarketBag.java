import java.util.ArrayList;

public class CompositeMarketBag implements MarketBag {

	private final ArrayList<MarketBag> smallbags = new ArrayList<>();

	public void add(MarketBag marketbag) {
		smallbags.add(marketbag);
	}

	@Override
	public void add() {
		for (MarketBag marketbag : smallbags) {
			marketbag.add();
		}
	}
}
