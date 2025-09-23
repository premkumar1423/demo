package prac;
abstract class Shape{
	int area;
	abstract void CalArea();
	public void show() {
		System.out.println("calculating the area");
	}
}
class Square extends Shape{
	 int s;
	 Square(int s){
		 this.s=s;
	 }
	void CalArea() {
		area = s*s;
		System.out.println("area of square"+area);
	}
}
class Rectangle extends Shape{
	 int l,b;
	 Rectangle(int l,int b){
		 this.l=l;
		 this.b=b;
	 }
	 void CalArea() {
		   area = l*b;
		   System.out.println("the area of the rectangle is"+area);
	 }
}
public class Methodoverride {

	public static void main(String[] args) {
		Square s=new Square(4); 
		Rectangle r=new Rectangle(2,5);
        s.CalArea();
        r.CalArea();
	}

}
