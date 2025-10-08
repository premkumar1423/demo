package prac;
class student{
	private String name;
	private int id;

   public String  getName() {
	return  name;
    }
   public void setName(String name) {
	this.name = name;
    }
    public int getId() {
	return id;
    }
    public void setId(int id) {
	this.id=id;
   }
	
  }

public class GeytterSetter {

	public static void main(String[] args) {
		student s=new student();
		s.setName("prem");
		s.setId(90);
		System.out.println("name = "+ s.getName());
		System.out.println("name = "+ s.getId());
	}

}
