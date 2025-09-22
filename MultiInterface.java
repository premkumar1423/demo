package prac;
interface Prac{
	void Show();
}
interface Prac1 extends Prac{
	void Show1();
	
}
class Minterface implements Prac1{
	public void Show() {
		System.out.println("this is show method ");
	}
	public void Show1() {
		System.out.println("this is show method 1");
	}

}
public class MultiInterface {
	public static void main(String args[]) {
		Minterface M =new Minterface();
		M.Show();
		M.Show1();
		
	}

}
