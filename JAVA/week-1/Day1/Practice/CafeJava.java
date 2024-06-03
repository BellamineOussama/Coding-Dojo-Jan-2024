
public class CafeJava {
    public static void main(String[] args) {

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double dripCoffeePrice = 5.5;
        double lattePrice = 3.3;
        double cappuccinoPrice = 6.0;

        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;

        System.out.println(generalGreeting + customer1);
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        }else {
            System.out.println(customer1 + pendingMessage );
        }


        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            double totalPrice = cappuccinoPrice + dripCoffeePrice;
            System.out.println(displayTotalMessage + totalPrice);
        }
        else{
            System.out.println(customer4 + pendingMessage);
        }


        System.out.println(generalGreeting + customer2);
        int quantityOrder = 2 ;
        double totalSamPrice = lattePrice * quantityOrder;
        System.out.println(customer2 + " Order " + quantityOrder + " latte, "+ displayTotalMessage + totalSamPrice);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }


        System.out.println(generalGreeting + customer3);
        double jimmyOriginalPrice = dripCoffeePrice;
        System.out.println(customer3 + " was charged for a coffee but had ordered a latte.");

        double jimmyLattePrice = lattePrice;
        double jimmyPriceDifference = jimmyLattePrice - jimmyOriginalPrice;

        double newTotal = jimmyOriginalPrice + jimmyPriceDifference;
        System.out.println("He owes an additional " + displayTotalMessage + newTotal + " to make up the difference.");
    }
}
