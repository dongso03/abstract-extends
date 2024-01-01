public class BulgogiPizza extends Pizza {
    public BulgogiPizza(int price, String size) {
        super(price, size);
    }

    @Override
    public void addToppings() {
    	System.out.println("불고기 토핑 추가 하시겠습니까? (추가 금액:2000원)");	
        System.out.println("원하면 1번 아니면 다른거아무거나");
    }

    // cook 메서드 오버라이드
    @Override
    public void cook() {
        System.out.println("불고기 피자 조리 중");
    }
}