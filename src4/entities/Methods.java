package entities;

public class Methods {

	private String name;
	private Integer age;
	private Double height;
	
	public Methods(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	public Double getHeight() {
		return height;
	}
}