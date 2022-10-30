package cysec.oop.music;

import java.io.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.util.*;

public class Music {

	public static void main(String[] args) {
		ArrayList<Instrument> orchestra = new ArrayList<Instrument>();

		for (int i = 0; i < Array.getLength(orchestra); i++) {
			//orchestra.
		}
		System.out.println(orchestra);
		
	}
	

}

class Instrument {
	public void play() {
		
	}
	
	public String what() {
		return " ";
	}
	
	public void adjust() {
		
	}
}

class Stringed extends Instrument {
	@Override
	public void play() {
		System.out.println("Stringed.play()");
	}
	
	@Override
	public String what() {
		return "Stringed";
	}
	
	@Override
	public void adjust() {
		System.out.println("Stringed.adjust()");
	} 
}

class Wind extends Instrument {
	@Override
	public void play() {
		System.out.println("Wind.play()");
	}
	
	@Override
	public String what() {
		return "Wind";
	}
	
	@Override
	public void adjust() {
		System.out.println("Wind.ajust()");
	} 
}

class Percussion extends Instrument {
	@Override
	public void play() {
		System.out.println("Percussion.play()");
	}
	
	@Override
	public String what() {
		return "Percussion";
	}
	
	@Override
	public void adjust() {
		System.out.println("Percussion.adjust()");
	} 
}

class Woodwind extends Wind {
	@Override
	public void play() {
		System.out.println("Woodwind.play()");
	}
	@Override
	public String what() {
		return "Woodwind";
	}
}

class Brass extends Wind {
	public void play() {
		System.out.println("Brass.play()");
	}
	
	public void adjust() {
		System.out.println("Brass.adjust()");
	}
	
}
