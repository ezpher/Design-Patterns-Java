package Prototype;

// Cloneable interface lets the compiler know that we intend to implement cloning (so there's compile-time exception check)
public interface Animal extends Cloneable {
	Animal makeCopy();
}
