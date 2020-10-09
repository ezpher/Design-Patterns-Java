package Observer;

public interface StockRandomizer {
	
	double getRandomStockPrice(double min, double max);
	void addStock(String stock);
	void removeStock(String stock);
}
