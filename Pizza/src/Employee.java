
public class Employee extends Person{
	private int money;

	public Employee(String job, String nationality, int money) {
		super(job, nationality);
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
