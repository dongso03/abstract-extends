import java.util.Random;

public class Customer extends Person {
	private int wallet;

	 public Customer( String nationality) {
	        super(nationality);
	        
	        this.wallet = new Random().nextInt(100000) + 10000;
	    }
	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}
	
	
}
