package poo;

public class Usuario {
	public Usuario(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String name;
	private String email;

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

}
