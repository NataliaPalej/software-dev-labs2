package week11.oop.code;

public class SomeGenericClass <T> {
	
	// Declare type
	private T t;
	
	public void add(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
