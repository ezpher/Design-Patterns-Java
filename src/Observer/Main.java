package Observer;

public class Main {
	
	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();
		stockGrabber.addStock("FB");
		stockGrabber.addStock("AMZN");
		stockGrabber.addStock("AAPL");
		stockGrabber.addStock("NFLX");
		stockGrabber.addStock("GOOG");
		
		System.out.println();
		
		new StockObserver(stockGrabber);
		new StockObserver(stockGrabber);
		new StockObserver(stockGrabber);
		
		System.out.println();
		
		stockGrabber.notifyObservers();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
		stockGrabber.notifyObservers();


	}

}
