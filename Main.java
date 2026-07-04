import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Cavid", 30.0);
        StockManager stockManager = new StockManager();
        MenuManager menuManager = new MenuManager();
        PaymentService paymentService = new BalancePaymentService();
        OrderManager orderManager = new OrderManager(stockManager, paymentService);
        ConsoleUI ui = new ConsoleUI();

        Food pizza = new Food("Pizza", 12.0);
        Food burger = new Food("Burger", 7.5);
        Food doner = new Food("Dönər", 4.0);

        menuManager.addToMenu(pizza);
        menuManager.addToMenu(burger);
        menuManager.addToMenu(doner);

        stockManager.addStock(pizza, 2);
        stockManager.addStock(burger, 5);
        stockManager.addStock(doner, 0);

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            ui.printWelcome(customer);
            ui.printMenu(menuManager, stockManager);

            int choice = scanner.nextInt();

            if (choice == 0) {
                isRunning = false;
            } else {
                Food selectedFood = menuManager.getFoodByIndex(choice - 1);
                orderManager.processOrder(customer, selectedFood);
            }
        }

        ui.printReceipt(customer);
        scanner.close();
    }
}