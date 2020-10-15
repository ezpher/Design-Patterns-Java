package Iterator;

public class CustomIterator implements Iterator  {
	
	private CustomIterableCollection collection;
	private int currentIndex = -1;
	
	public CustomIterator(CustomIterableCollection collection) {
		this.collection = collection;
	}
	
	@Override
	public String getNext() {
		return this.collection.getStringAtIndex(++currentIndex);
	}

	@Override
	public boolean hasNext() {
		return (currentIndex < this.collection.getSize()-1);
	}

}