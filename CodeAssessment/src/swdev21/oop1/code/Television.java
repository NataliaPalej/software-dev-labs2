/** 
 * Natalia Palej A00279259 
 **/

package swdev21.oop1.code;

public abstract class Television implements ElectronicDevice{
	private String theMake;
	private String theModel;
	
	// Television constructor
	public Television(String aMake, String aModel){
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

}

class Plasma extends Television implements HighlyDesirable{
	Plasma(String aMake, String aModel){
		super(aMake, aModel);
	}

	@Override
	public void turnOn() {
		System.out.println("Plasma::turnOn()");	
	}

	@Override
	public void turnOff() {
		System.out.println("Plasma::turnOff()");
	}
}

class LED extends Television{
	LED(String aMake, String aModel) {
		super(aMake, aModel);
	}

	@Override
	public void turnOn() {
		System.out.println("LED::turnOn()");		
	}

	@Override
	public void turnOff() {
		System.out.println("LED::turnOff()");	
	}
}


