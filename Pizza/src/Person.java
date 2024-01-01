import java.util.Random;

public class Person {
	private String identity;
	private String nationality;

	public Person(String job, String nationality) {
		super();
		this.identity = job;
		this.nationality = nationality;
	}

	public Person(String nationality) {
		super();
		this.nationality = nationality;
	}

	public String getJob() {
		return identity;
	}

	public void setJob(String job) {
		this.identity = job;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}
