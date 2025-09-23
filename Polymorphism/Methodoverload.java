package prac;
class OverLoad{
	public void show() {
		System.out.println("this is a default parameter");
	  }
	public void show(int a) {
		System.out.println("this is one parameter"+a);
		
	}
	public void show(int a,int b) {
		System.out.println("the valueof a = "+a+" , the value of b ="+b+".");
	}
	}
public class Methodoverload {

	public static void main(String[] args) {
		OverLoad o=new OverLoad();
		o.show();
		o.show(9);
		o.show(2,5);

	}

}

