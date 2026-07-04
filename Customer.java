import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private double balance;
    private final List<Food> ownedFoods;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.ownedFoods = new ArrayList<>();
    }

    public String getName() { return name; }
    public double getBalance() { return balance; }

    public void reduceBalance(double amount) {
        this.balance -= amount;
    }

    public void addFood(Food food) {
        this.ownedFoods.add(food);
    }

    public List<Food> getOwnedFoods() { return ownedFoods; }
}