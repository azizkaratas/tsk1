public class BalancePaymentService implements PaymentService {
    @Override
    public void processPayment(Customer customer, double amount) {
        if (customer.getBalance() < amount) {
            throw new InsufficientBalanceException("Balansınızda kifayət qədər vəsait yoxdur! Çatışmayan: " + (amount - customer.getBalance()) + " AZN");
        }
        customer.reduceBalance(amount);
    }
}