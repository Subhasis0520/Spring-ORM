package spring.jdbc;

public class Student {

	private int sid;
	private String name;
	private int age;
	private String favSub;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavSub() {
		return favSub;
	}
	public void setFavSub(String favSub) {
		this.favSub = favSub;
	}
	public Student() {

	}
	public Student(int sid, String name, int age, String favSub) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
		this.favSub = favSub;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + ", favSub=" + favSub + "]";
	}
	
}
