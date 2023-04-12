package week10.code;

public class SomeGenericClass<T> {
	
	// Declare T as a generic
	private T t;
	
	// Add method acts as setter
	public void add(T t) {
		this.t = t;
	}
	
	// Getter method
	public T get() {
		return t;
	}

}
