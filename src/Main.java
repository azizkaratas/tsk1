import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MarketService marketService = new MarketService();

        Customer customer = new Customer(40.0);

        List<Food> menu = new ArrayList<>();
        menu.add(new Food("Burger", 8.50, 5));
        menu.add(new Food("Pizza", 15.00, 3));
        menu.add(new Food("Dönər", 4.00, 10));

        while (true) {
            System.out.println("Balansınız: " + customer.getBalance() + " AZN");
            System.out.println("Aldığınız yeməklər: " + customer.getOwnedFoods());

            marketService.displayMenu(menu);
            System.out.println("0. Çıxış");
            System.out.print("Almaq istədiyiniz yeməyin nömrəsini seçin: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Sistemdən çıxıldı. Nuş olsun!");
                break;
            }

            if (choice > 0 && choice <= menu.size()) {
                Food selectedFood = menu.get(choice - 1);
                marketService.buyFood(customer, selectedFood);
            } else {
                System.out.println("Yanlış seçim etdiniz, yenidən yoxlayın.");
            }
        }
    }
}