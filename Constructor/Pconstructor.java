package prac;

public class Pconstructor {
	Pconstructor(int a,int b){
		System.out.println("the value of a is:" + a +"   and    the value of b is:"+ b +".");
	}
public void show() {
	System.out.println("this is a show method");
}
	public static void main(String[] args) {
		Pconstructor c= new Pconstructor(2,4); 
		c.show();

	}

}
