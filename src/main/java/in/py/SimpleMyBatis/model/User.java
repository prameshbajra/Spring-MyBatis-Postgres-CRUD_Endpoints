package in.py.SimpleMyBatis.model;

public class User {

	private String name;
	private String pwd;
	private int id;

	public User() {
	}

	public User(String name, String pwd, Integer id) {

		this.name = name;
		this.pwd = pwd;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
