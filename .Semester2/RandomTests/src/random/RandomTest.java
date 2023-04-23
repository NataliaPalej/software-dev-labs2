package random;

public class RandomTest {
	
	static int a;
	int b;
	
	public void incr() {
		int c = a++;
		b++;
		c++;
		System.out.println(a+" "+b+" "+c);
	}

	public static void main(String[] args) {
		RandomTest test = new RandomTest();
		test.incr();
		a++;
		test = new RandomTest();
		test.incr();
	}
}
