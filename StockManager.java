import java.util.HashMap;
import java.util.Map;

public class StockManager {
    private final Map<Food, Integer> stocks = new HashMap<>();

    public void addStock(Food food, int quantity) {
        stocks.put(food, quantity);
    }

    public int getStock(Food food) {
        return stocks.getOrDefault(food, 0);
    }

    public boolean hasStock(Food food) {
        return getStock(food) > 0;
    }

    public void decreaseStock(Food food) {
        if (hasStock(food)) {
            stocks.put(food, stocks.get(food) - 1);
        }
    }
}