package week7;

class MyException extends Exception{

	public static void main(String[] args) {
		try {
			a();
		} catch (Exception e) {
			System.out.println("a(): " + e);
		}
	}
	
	public static void a() {
		System.out.println("a()");
		b();
	}
	
	public static void b() {
		try {
			System.out.println("b()");
			c();
		} catch (MyException e) {
			System.out.println("b(): " + e);
		}
	}
	
	public static void c() throws MyException {
		System.out.println("c()");
		System.out.println("An I/O exception occurred");
	}
}