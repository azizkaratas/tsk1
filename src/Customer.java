import java.util.ArrayList;
import java.util.List;

public class Customer {
    private double balance;
    private List<String> ownedFoods;

    public Customer(double balance) {
        this.balance = balance;
        this.ownedFoods = new ArrayList<>();
    }

    public double getBalance() { return balance; }

    public void deductBalance(double amount) {
        this.balance -= amount;
    }

    public void addFood(String foodName) {
        this.ownedFoods.add(foodName);
    }

    public List<String> getOwnedFoods() { return ownedFoods; }
}