import java.util.List;

public class MarketService {

    public void displayMenu(List<Food> menu) {
        System.out.println("--- YEMƏK MENYUSU ---");
        for (int i = 0; i < menu.size(); i++) {
            Food food = menu.get(i);
            System.out.println((i + 1) + ". " + food.getName() +
                    " - Qiymət: " + food.getPrice() + " AZN | Stok: " + food.getStock());
        }
    }

    public void buyFood(Customer customer, Food food) {
        if (food.getStock() <= 0) {
            System.out.println("Təəssüf ki, " + food.getName() + " bitib!");
            return;
        }

        if (customer.getBalance() < food.getPrice()) {
            System.out.println("Balansınızda kifayət qədər vəsait yoxdur!");
            return;
        }

        food.reduceStock(1);
        customer.deductBalance(food.getPrice());
        customer.addFood(food.getName());

        System.out.println("Uğurla alındı: " + food.getName());
    }
}