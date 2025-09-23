package prac;
class Base{
	public void method1() {
		System.out.println("this is a method1 GRANT PARENT");
	}
}
 class Base1 extends Base{
	public void method2() {
	System.out.println("this is a method2 PARENT");
	
   } 
 }
class Base2 extends Base1{                         //MULTI LEVEL INHERITANCE   //     A
		public void method3() {                                                //     |
			System.out.println("this is method3 CHILD");                       //     B
		}                                                                      //    / 
	}                                                                         //     C

public class Multilevel {
public static void main(String[] args) {
	Base2 M =new Base2();
	M.method1();
	M.method2();
	M.method3();
	
	
	
 }
}

