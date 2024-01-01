import java.util.Random;

public class Acting {
    public static void main(String[] args) {
        PizzaStore pzs = new PizzaStore();
        
       
        int nusOfCus = 50; // 원하는 고객 수 설정
        Customer[] customers = new Customer[nusOfCus];

        for (int i = 0; i < nusOfCus; i++) {
            String nationality = getRandomNationality();
            customers[i] = new Customer(nationality);
           
        }

        
        for (Customer customer : customers) {
            pzs.orderProcess(customer);
        }
    }

   
    private static String getRandomNationality() {
        String[] nationalities = {"Korean", "American"}; // 원하는 국적 추가 가능
        int randomIndex = new Random().nextInt(nationalities.length);
        return nationalities[randomIndex];
    }
}