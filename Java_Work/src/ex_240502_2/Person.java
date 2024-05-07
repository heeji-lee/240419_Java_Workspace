package ex_240502_2;

class Person {
	
	private String name;
	private String number;
	private String now;

	public Person(String name, String number, String now) {
		super();
		this.name = name;
		this.number = number;
		this.now = now;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNow() {
		return now;
	}

	public void setNow(String now) {
		this.now = now;
	}
	
}