package util.dto;

public class Person {
	private String name;
	private String contact;
	private String regDate;
	
	public Person(String name, String contact, String regDate) {
		super();
		this.name = name;
		this.contact = contact;
		this.regDate = regDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", contact=" + contact + ", regDate=" + regDate + "]";
	}
	
}