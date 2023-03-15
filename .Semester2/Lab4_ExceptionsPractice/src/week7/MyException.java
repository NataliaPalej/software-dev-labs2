package week7;

class MyException extends Exception{

	public static void main(String[] args) {
		try {
			a();
		} catch (MyException e) {
			System.out.println("a(): " + e);
		}
	}
	
	public static void a() throws MyException {
		b();
	}
	
	public static void b() {
		try {
			c();
		} catch (MyException e) {
			System.out.println("b(): " + e);
		}
	}
	
	public static void c() throws MyException {
		System.out.println("An I/O exception occurred");
	}
}