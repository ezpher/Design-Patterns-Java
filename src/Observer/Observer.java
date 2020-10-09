package Observer;

import java.util.Map;

public interface Observer {
	void updateStockPrices(Map<String, Double> stocks);
}
