import java.util.ArrayList;
import java.util.List;

public class MenuManager {
    private final List<Food> menu = new ArrayList<>();

    public void addToMenu(Food food) {
        menu.add(food);
    }

    public List<Food> getMenu() {
        return menu;
    }

    public Food getFoodByIndex(int index) {
        if (index >= 0 && index < menu.size()) {
            return menu.get(index);
        }
        return null;
    }
}