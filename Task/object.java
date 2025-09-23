package prac;

 class Car {
	
	String colour ="red";
	String model ="i20";
	String company="hundai";
	
	public static void accelerate() {
		System.out.println("car is moving");
	}
	public static void drift() {
		System.out.println("car is drifting to left or right");
	}
	public static void stop() {
		System.out.println("car engine is stopped");
	}
}

public class object {

	public static void main(String[] args) {
		Car c=new Car();
		System.out.println(c.colour);
	   c.accelerate();
       c.drift();
       c.stop();
	}

}
