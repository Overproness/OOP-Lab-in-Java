// M. Muntazar
// 470861
// BSDS-1A

package Task_1;


class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    public CreditCard(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount + " for card ending in " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Payment processed successfully. Confirmation email sent to " + cardHolderName);
    }
}

class PayPal implements PaymentMethod {
    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println(" PayPal payment of $" + amount + " for email " + email);
        System.out.println("Payment processed successfully. Confirmation email sent to " + email);
    }
}

class Cash implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        // Simulate processing a cash payment
        System.out.println("Processing cash payment of $" + amount);
        System.out.println("Payment received. Thank you!");
    }
}

public class PaymentProcessor {
    public static void main(String[] args) {
        PaymentMethod[] paymentMethods = new PaymentMethod[]{
                new CreditCard("1234 5678 9012 3456", "John Doe"),
                new PayPal("john.doe@example.com", "password123"),
                new Cash()
        };

        double amount = 100.00; // Predefined amount

        // Process each payment and print confirmation message
        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.processPayment(amount);
            System.out.println();
        }
    }
}


