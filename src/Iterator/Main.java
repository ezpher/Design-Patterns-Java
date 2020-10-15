package Iterator;

public class Main {

	public static void main(String[] args) {
		
		IterableCollection customIterableCollection = new CustomIterableCollection();
		
		Iterator customIterator = customIterableCollection.getIterator();
		
		while (customIterator.hasNext()) {
			System.out.println(customIterator.getNext());
			
		}
	}

}
