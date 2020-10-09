package Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class StockGrabber implements Subject, StockRandomizer {
		
	private Map<String,Double> stocks = new HashMap<String,Double>();
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public double getRandomStockPrice(double min, double max) {
		
		Random random = new Random();
		
		if (!Double.valueOf(max-min).isInfinite()) {
			return (min + (max-min) * random.nextDouble());
			
		} else {
			return (0.0 + (1000-0.0) * random.nextDouble());
			
		}
	}	
		
	@Override
	public void addStock(String stock) {
		
		if (!stocks.containsKey(stock)) {
			stocks.put(stock, getRandomStockPrice(0.0, 1000));	
			
			System.out.println("Added stock: " + stock);
		}			
	}

	@Override
	public void removeStock(String stock) {

		stocks.remove(stock);
							
		System.out.println("Removed stock: " + stock);
	}
	
	
	@Override
	public void register(Observer o) {
		
		observers.add(o);
		
		System.out.println("Registered Observer: " + o);

	}

	@Override
	public void deregister(Observer o) {
		observers.remove(o);
		
		System.out.println("Deregistered Observer: " + o);
	}

	@Override
	public void notifyObservers() {
		
		for (Map.Entry<String, Double> stock : stocks.entrySet()) {
			stock.setValue(getRandomStockPrice(0, 1000));
		}
		
		for (Observer observer : observers) {
			observer.updateStockPrices(stocks);
		}
	}
	
}
