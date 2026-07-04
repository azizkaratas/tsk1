import java.util.List;

public interface FoodRepository {
    void save(Food food);
    List<Food> findAll();
    Food findByIndex(int index);
}