package prac;

 interface inter {
	void first();
	void sceond();

}
 class FirstYear implements inter{
	int telugu=70;
	int english=80;
	int maths_a=75;
	int maths_b=70;
	int physics=55;
	   public void first()
	 {
		 System.out.println("first year marks = " +(telugu+english+maths_a+maths_b+physics));
	 }
	   public void second() {
		   System.out.println("second year marks ");
		   System.out.println("-----------------------------------------------------------------------------------------------------");
	   }
 }
class SecondYear implements inter{
    int telugu=90;
    int english=85;
	int maths_a=69;
    int maths_b=71;
	int physics=59;
	 public void second()
	 {
		  System.out.println("second year marks =" +(telugu+english+maths_a+maths_b+physics));
	  }
	 public void first()
	 {
		 System.out.println("first year marks ");
	 }
}

public class InterfaceExample {
	public static void main(String[] args) {
		FirstYear f=new FirstYear();
		f.first();
		f.second();
		SecondYear s=new SecondYear();
		s.first();
		s.second();
	}

}
