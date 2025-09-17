package prac;

 class DefaultConstructor {
	DefaultConstructor(){
		System.out.println("this is a constructor");
	}
public void show() {
	System.out.println("this is a method");
}
	public static void main(String[] args) {
		DefaultConstructor ob=new DefaultConstructor();
		
	//	ob.DefaultConstructor();
		ob.show();
		

	}

}
