package ba.bitcamp.edvin.test;

public class Employee implements Searchable {
	/**
	 * creating constants for gender
	 */
	public static final Integer MALE = 0;
	public static final Integer FEMALE = 1;

	/**
	 * creating properties of class
	 */
	private String name;
	private String surname;
	private Integer age;
	private Integer gender;

	/**
	 * generating constructor
	 * @param name name of employee
	 * @param surname surname of employee
	 * @param age employee age
	 * @param gender employee gender
	 */
	public Employee(String name, String surname, Integer age, Integer gender) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.gender = gender;
	}
	/**
	 * generating setters and getters
	 * @return
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	/**
	 * generating to string method for printing
	 */
	public String toString() {
		String s = "Name: " + name + "\n";
		s += "Surname: " + surname + "\n";
		s += "Age: " + age + "\n";
		s += "Gender: " + getGender(gender) + "\n";

		return s;
	}
	
	public String getGender(int gender) {
		switch (gender) {
		case 0:
			return "MALE";
		case 1:
			return "FEMALE";
		}
		return "";
	}
	/**
	 * Checking name, surname, age, and gender contains a word that user enter 
	 */
	@Override
	public boolean fitsSearch(String s) {
		if (name.equals(s)) {
			return true;
		} else if (surname.equals(s)) {
			return true;
		} else if (Integer.parseInt(s) == age) {
			return true;
		} else if (gender.equals(s)) {
			return true;
		}
		return false;
	}
}