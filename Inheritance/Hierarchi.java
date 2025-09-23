package prac;
class animal{
	public void show() {
		System.out.println("dog and cat are animais");
	}
}
class  dog extends animal{
	public void show1(){
	System.out.println("dog is  barks");
	}
}
class cat extends animal{
	public void show2(){
		System.out.println("cat is meouu");
	}
		
}


public class Hierarchi {
	

	public static void main(String[] args) {
	dog d=new dog();
	cat c=new cat();
	d.show();
	d.show1();
    c.show();
    c.show2();

	}

}
