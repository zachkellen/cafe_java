public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffePrice = 1.5;
        double lattePrice = 2.5;
        int cappuccinoPrice = 3;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if(isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + dripCoffePrice);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        if(isReadyOrder2) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        System.out.println(displayTotalMessage + (lattePrice * 2));
        if(isReadyOrder3) {
            System.out.println(customer2 + readyMessage);
            isReadyOrder3 = false;
            // System.out.println(displayTotalMessage + (lattePrice * 2));
        } else {
            System.out.println(customer2 + pendingMessage);
            isReadyOrder3 = true;
        }

        System.out.println(customer3 + displayTotalMessage + (lattePrice - dripCoffePrice));
    }
}
