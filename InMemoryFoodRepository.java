import java.util.ArrayList;
import java.util.List;

public class InMemoryFoodRepository implements FoodRepository {
    private final List<Food> database = new ArrayList<>();

    @Override
    public void save(Food food) {
        database.add(food);
    }

    @Override
    public List<Food> findAll() {
        return new ArrayList<>(database);
    }

    @Override
    public Food findByIndex(int index) {
        if (index < 0 || index >= database.size()) {
            throw new FoodNotFoundException("Daxil etdiyiniz nömrəyə uyğun yemək tapılmadı!");
        }
        return database.get(index);
    }
}