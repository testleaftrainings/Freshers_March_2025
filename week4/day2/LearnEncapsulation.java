package week4.day2;

public class LearnEncapsulation {

	private int age;
	
	private String name;

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		
		
		LearnEncapsulation obj=new LearnEncapsulation();
		obj.setName("vinoth");
		obj.setAge(30);
		
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		
	}
	
	
	
}
