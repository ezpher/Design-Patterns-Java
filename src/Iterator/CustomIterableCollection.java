package Iterator;

import java.util.ArrayList;

public class CustomIterableCollection implements IterableCollection {
	
	private ArrayList<String> internalList = new ArrayList<String>();
	
	public CustomIterableCollection() {
		this.internalList.add("Element 1");
		this.internalList.add("Element 2");
		this.internalList.add("Element 3");
	}
	
	@Override
	public CustomIterator getIterator() {
		return new CustomIterator(this);
	}
	
	public int getSize() {
		return internalList.size();
	}
	
	public String getStringAtIndex(int index) {
		return internalList.get(index);
	}
}
