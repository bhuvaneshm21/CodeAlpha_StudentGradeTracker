import java.util.Scanner;
import java.util.HashMap;

public class StockTrading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<String, Double> market = new HashMap<>();
        market.put("GOOGLE", 150.0);
        market.put("APPLE", 180.0);
        market.put("TATA", 120.0);

        double balance = 1000.0; 
        HashMap<String, Integer> portfolio = new HashMap<>();

        System.out.println("--- CodeAlpha Stock Trading Platform ---");
        
        while (true) {
            System.out.println("\nYour Balance: $" + balance);
            System.out.println("Market Prices: " + market);
            System.out.println("Your Portfolio: " + portfolio);
            System.out.println("1. Buy | 2. Sell | 3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 3) break;

            System.out.print("Enter Stock Name (GOOGLE/APPLE/TATA): ");
            String stock = sc.next().toUpperCase();

            if (!market.containsKey(stock)) {
                System.out.println("Invalid Stock!");
                continue;
            }

            if (choice == 1) { 
                System.out.print("Quantity to buy: ");
                int qty = sc.nextInt();
                double cost = qty * market.get(stock);
                if (balance >= cost) {
                    balance -= cost;
                    portfolio.put(stock, portfolio.getOrDefault(stock, 0) + qty);
                    System.out.println("Bought " + qty + " shares of " + stock);
                } else {
                    System.out.println("Insufficient Balance!");
                }
            } else if (choice == 2) { 
                System.out.print("Quantity to sell: ");
                int qty = sc.nextInt();
                if (portfolio.getOrDefault(stock, 0) >= qty) {
                    balance += qty * market.get(stock);
                    portfolio.put(stock, portfolio.get(stock) - qty);
                    System.out.println("Sold " + qty + " shares of " + stock);
                } else {
                    System.out.println("Not enough shares!");
                }
            }
        }
        System.out.println("Thank you for trading!");
        sc.close();
    }
}