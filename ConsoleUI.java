public class ConsoleUI {
    public void printWelcome(Customer customer) {
        System.out.println("Müştəri: " + customer.getName() + " | Balans: " + customer.getBalance() + " AZN");
    }

    public void printMenu(MenuManager menuManager, StockManager stockManager) {
        System.out.println("--- YEMƏK MENYUSU ---");
        var menu = menuManager.getMenu();
        for (int i = 0; i < menu.size(); i++) {
            Food food = menu.get(i);
            System.out.println((i + 1) + ". " + food.getName() +
                    " | Qiymət: " + food.getPrice() + " AZN" +
                    " | Stok: " + stockManager.getStock(food));
        }
        System.out.println("0. Çıxış");
        System.out.print("Seçiminiz: ");
    }

    public void printReceipt(Customer customer) {
        System.out.println("--- ALDIĞINIZ YEMƏKLƏR ---");
        if (customer.getOwnedFoods().isEmpty()) {
            System.out.println("Heç bir şey almadınız.");
        } else {
            for (Food f : customer.getOwnedFoods()) {
                System.out.println("- " + f.getName());
            }
        }
        System.out.println("Sağ olun, nuş olsun!");
    }
}