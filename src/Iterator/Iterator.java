package Iterator;

// Iterator is a behavioural design pattern that lets you access the elements of an aggregate
// object i.e. collection, sequentially without exposing its underlying representation

public interface Iterator {
	// assume that return type is string; can modify later to use generics
	String getNext();
	
	boolean hasNext();
}
