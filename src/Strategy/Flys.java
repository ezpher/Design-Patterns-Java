package Strategy;

public interface Flys {
	String fly();
}

// note that only 1 top level public class/interface allowed in a java package
// easier for compiler to link source file to compiled file
// see: https://dzone.com/articles/why-single-java-source-file-can-not-have-more-than
class ItFlys implements Flys {

	@Override
	public String fly() {
		return "I'm Flying";
	}
		
}

class CantFly implements Flys {

	@Override
	public String fly() {
		return "I Can't Fly!";
	}
		
}

