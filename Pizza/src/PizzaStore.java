import java.util.Scanner;

public class PizzaStore {
	Pizza pizza;
	PepperoniPizza pp = new PepperoniPizza(20000, "large");
	PepperoniPizza pp2 = new PepperoniPizza(15500, "medium");
	BulgogiPizza bp = new BulgogiPizza(23000, "large");
	BulgogiPizza bp2 = new BulgogiPizza(17000, "medium");
	Chef cf = new Chef("chef", "korean", 30);
	Employee emp = new Employee("employee", "korean", 0);
	Customer[] customer = new Customer[50];
	
	Scanner scan = new Scanner(System.in);

	public void orderProcess(Customer customer) {
		 while (true) {
		 System.out.println("1. 페페로니 (Large) - 20000원");
	        System.out.println("2. 페페로니 (Medium) - 15500원");
	        System.out.println("3. 불고기 (Large) - 23000원");
	        System.out.println("4. 불고기 (Medium) - 17000원");
	        
	        System.out.print("메뉴를 선택하세요 (1-4), 종료는 0: ");
	        int input = scan.nextInt();
	        if (input == 0) {
                System.out.println("주문 종료");
                break;
            }
	        Pizza selectedPizza = null;

	        switch (input) {
	      
	        case 1:
	            selectedPizza = pp;
	            pp.addToppings();
	            // 추가된 토핑 가격만큼 고객의 지갑에서 차감
	            int input2 = scan.nextInt();
	            switch (input2) {
	                case 1:
	                    customer.setWallet(customer.getWallet() - 2000);
	                    pp.cook();
	                    break;
	                default:
	                    pp.cook();
	                    break;
	            }
	            break; // switch 문을 빠져나가도록 추가
	            case 2:
	                selectedPizza = pp2;
	                pp2.addToppings();
	                int input3 = scan.nextInt();
	                switch (input3) {
	                case 1:
	                    customer.setWallet(customer.getWallet() - 2000);
	                    pp2.cook();
	                    break;
	                default:
	                    pp2.cook();
	                    break;
	            }
	            break; // switch 문을 빠져나가도록 추가
	            case 3:
	                selectedPizza = bp;
	                bp.addToppings();
	                int input4 = scan.nextInt();
	                switch (input4) {
	                case 1:
	                    customer.setWallet(customer.getWallet() - 2000);
	                    bp.cook();
	                    break;
	                default:
	                    bp.cook();
	                    break;
	            }
	            break; // switch 문을 빠져나가도록 추가

	            case 4:
	            	int input5 = scan.nextInt();
	                switch (input5) {
	                case 1:
	                    customer.setWallet(customer.getWallet() - 2000);
	                    bp2.cook();
	                    break;
	                default:
	                    bp2.cook();
	                    break;
	            }
	            break; // switch 문을 빠져나가도록 추가

	            default:
	                System.out.println("잘못된 선택입니다.");
	                return;
	        }

	        order(customer, selectedPizza);
	        selectedPizza.cook();
	    }
	}

	
	
	public void order(Customer customer, Pizza pizza) {
        if (customer.getNationality().equals(emp.getNationality())) {
            if (pizza.getPrice() <= customer.getWallet()) {
                System.out.println("주문 완료");
                customer.setWallet(customer.getWallet() - pizza.getPrice());
                cf.setIngredientAmount(cf.getIngredientAmount()-1);
                System.out.println("피자남은 수량: "+ cf.getIngredientAmount());
            } else {
                System.out.println("금액 부족");
            }
        } else {
            System.out.println("국적이 달라 못 알아먹습니다");
        }
    }

	   
}
