package zadaci_05_02_2016;

import zadaci_05_02_2016.Fan; // import Fan class

public class Zadatak1 {
	
	 public static void main(String[] args) {
		 // creating fan1
	        Fan fan1 = new Fan();
	        fan1.setSpeed(Fan.FAST);
	        fan1.setOn(true);
	        fan1.setRadius(10);
	        fan1.setColor("yellow");
	        // creating fan2
	        Fan fan2 = new Fan();
	        fan2.setSpeed(Fan.MEDIUM);
	        fan2.setRadius(5);
	        fan2.setColor("blue");
	        fan2.setOn(false);
	        // testing toString mehod for both fans
	        System.out.println("Fan #1: "+fan1.toString());
	        System.out.println("Fan #2: "+fan2.toString());
	    }

}
