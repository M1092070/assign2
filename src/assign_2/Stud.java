package assign_2;

public class Stud {
	
	private int id;
	private int age;
	private int purchesamount;
	private String name;
	public Stud(int id, int age, int purchesamount, String name) {
		super();
		this.id = id;
		this.age = age;
		this.purchesamount = purchesamount;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPurchesamount() {
		return purchesamount;
	}
	public void setPurchesamount(int purchesamount) {
		this.purchesamount = purchesamount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stud [id=" + id + ", age=" + age + ", purchesamount=" + purchesamount + ", name=" + name + "]";
	}
	
	
	

}
