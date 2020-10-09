package Observer;

import java.util.Map;

public class StockObserver implements Observer {
	
	private static int observerIDTracker = 0;
	
	private int observerID;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber) {
		
		++observerIDTracker;		
		observerID = observerIDTracker;
		
		System.out.println("New Stock Observer " + this.observerID);
		
		this.stockGrabber = stockGrabber;
		this.stockGrabber.register(this);
	}
	
	@Override
	public void updateStockPrices(Map<String, Double> stocks) {
		for (Map.Entry<String, Double> stock : stocks.entrySet()) {
			System.out.println("Current Price for " + stock.getKey() + ": " + stock.getValue());
		}
	}
	
	@Override
	public String toString() {
		return Integer.toString(this.observerID); 
	}

}
