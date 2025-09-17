package prac;
class bus{
	public void show1() {
		System.out.println("this is show");
}
}
class bus1 extends bus{                               //SINGLE INHERITANCE
	 public void show2() {                              //     A
		 System.out.println("this is show2 method");    //     |
		                                                //     B
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		
     bus1 obj=new bus1();
     obj.show1();
     obj.show2();

	}

}
