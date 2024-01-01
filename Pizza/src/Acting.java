public class Acting {
    public static void main(String[] args) {
        PizzaStore pzs = new PizzaStore();
        
        // 고객 생성
        Customer customer = new Customer("korean");
        
        // 주문 프로세스 실행
        pzs.orderProcess(customer);
    }
}