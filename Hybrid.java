package prac;

class base{
	public void method() {
		System.out.println("this is method ");
	}
}
class base1 extends base{
	public void method1(){                                    //     HYBRID 
		System.out.println("this is method 1");               //      base
	}                                                         //     /    \
}                                                             //  base1   base2
class base2 extends base{                                     //           \
	public void method2() {                                  //            base3
		System.out.println("this is method 2");              //
	}
}
class base3 extends base2{
	public void method3() {
		System.out.println("this is method3");
	}
}
public class Hybrid {

	public static void main(String[] args) {
		base1 obj =new base1();
		base3 bj =new base3();
   obj.method();
   obj.method1();
   bj.method();
   bj.method3();
   bj.method2();
 //  bj.method1();
   
	}

}
