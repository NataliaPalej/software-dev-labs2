/** 
 * Natalia Palej A00279259 
 **/

package swdev21.oop1.code;

public abstract class Computer implements ElectronicDevice{
	private String theMake;
	private String theModel;
	
	public Computer(String aMake, String aModel){
		this.theMake = aMake;
		this.theModel = aModel;
	}
	
	
	public String getTheMake() {
		return theMake;
	}
	public String getTheModel() {
		return theModel;
	}
	
	@Override
	public String toString() {
		return theMake + " " + theModel;
	}
	
	public abstract boolean login(String user, String pass);
	public abstract boolean logout();
}

class Laptop extends Computer{
	public Laptop(String aMake, String aModel) {
		super(aMake, aModel);
	}

	@Override
	public void turnOn() {
		System.out.println("Laptop::turnOn()");	
	}

	@Override
	public void turnOff() {
		System.out.println("Laptop::turnOff()");
	}

	@Override
	public boolean login(String user, String pass) {
		System.out.println("Laptop::login()");
		return true;
	}

	@Override
	public boolean logout() {
		System.out.println("Laptop::logout()");
		return true;
	}
	
}

class Ipad extends Computer implements HighlyDesirable{
	public Ipad(String aMake, String aModel) {
		super(aMake, aModel);
	}

	@Override
	public void turnOn() {
		
	}

	@Override
	public void turnOff() {
		
	}

	@Override
	public boolean login(String user, String pass) {
		return false;
	}

	@Override
	public boolean logout() {
		return false;
	}
	
}


