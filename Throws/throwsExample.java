package throwthrows;
class sample{ 
	int A=17;
	public  void show()throws Exception{
		if( A < 18)
			
			throw new ArithmeticException("not elgible for vote");
		
		else
			System.out.println("elgible for vote");
	}
 }

public class throwsExample {

	public static void main(String[] args)throws Exception {
		sample s1 =new sample();
		s1.show();

	}

}
