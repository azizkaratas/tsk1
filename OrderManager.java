public class OrderManager {
    private final StockManager stockManager;
    private final PaymentService paymentService;

    public OrderManager(StockManager stockManager, PaymentService paymentService) {
        this.stockManager = stockManager;
        this.paymentService = paymentService;
    }

    public void processOrder(Customer customer, Food food) {
        if (!stockManager.hasStock(food)) {
            throw new OutOfStockException("Təəssüf ki, " + food.getName() + " stokda bitib!");
        }

        paymentService.processPayment(customer, food.getPrice());

        stockManager.decreaseStock(food);
        customer.addFood(food);
        System.out.println("UĞURLU: " + food.getName() + " alındı və çantanıza əlavə olundu.");
    }
}