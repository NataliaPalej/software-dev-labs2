/** 
 * Natalia Palej A00279259 
 **/

package swdev21.oop1.code;

import java.util.ArrayList;

public class Shop {

	public static void main(String[] args) {
		ArrayList<ElectronicDevice> devices = new ArrayList<ElectronicDevice>();
		
		Plasma sony = new Plasma("Sony", "P300");
		devices.add(sony);
		
		Laptop dell = new Laptop("Dell", "Inspiron");
		devices.add(dell);
		
		processDevices(devices);
	}
	
	public static void processDevices(ArrayList<ElectronicDevice> devices){
		for (ElectronicDevice device : devices){
			//isinstanceof - tagging interface checker
			if (device instanceof HighlyDesirable){
				System.out.println(device.toString() + " - Highly Desirable Item");
			}
			else
			{
				System.out.println(device.toString());
			}
		}
	}

}
