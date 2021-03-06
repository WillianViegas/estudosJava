package entities;

public class Quartos {
	private String name;
	private String email;
	private int number;
	
	public Quartos(String name, String email, int number) {
		this.name = name;
		this.email = email;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String toString() {
		return number
			+ ": "
			+ name
			+ ", "
			+ email;
	}
	
}


