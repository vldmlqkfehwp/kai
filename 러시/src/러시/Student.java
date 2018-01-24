package 러시;

public class Student {

	//멤버변수
	private int age;
	private String name;
	private String phone;
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void print()
	{
		System.out.println("나이를 입력하세요 : ");
		System.out.println("이름을 입력하세요 : ");
		System.out.println("전화번호를 입력하세요 : ");
}		
	
}
