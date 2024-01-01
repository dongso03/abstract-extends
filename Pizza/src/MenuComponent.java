
abstract class MenuComponent {
	    protected int price;
	    protected String size;

	    public MenuComponent(int price, String size) {
	        this.price = price;
	        this.size = size;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public String getSize() {
	        return size;
	    }

	    // 서브클래스에서 구현할 추상 메서드
	    public abstract void cook();
	}


	
