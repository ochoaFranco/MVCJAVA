package View;

import java.util.Scanner;

import Controller.CurrencyController;

public class CurrencyView {
    private Scanner sc;
    private CurrencyController controller;
    
    public CurrencyView(CurrencyController controller) {
        this.sc = new Scanner(System.in);
        this.controller = controller;
    }

    public void displayMenu() {
        System.out.println("Currency Conversion Application");
        System.out.println("1. Set Exchange Rate");
        System.out.println("2. Convert Currency");
        System.out.println("3. Get Exchange Rate");
        System.out.println("4. Exit");
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public int getUserInput() {
        int choice = sc.nextInt();
        return choice;
    }

    public void run() {
        boolean continueRunning = true;
        while(continueRunning) {
            displayMenu();
            int userInput = getUserInput();
            switch(userInput) {
                case 1:
                    displayMessage("Enter the new exchange rate: ");
                    float rate = getUserInput();
                    controller.setExchangeRate(rate);
                    break;
                case 2:
                    displayMessage("Enter the amount in dollars: ");
                    int dollarsAmount = getUserInput();
                    displayMessage(dollarsAmount + " USD is equivalent to " + controller.convertCurrency(dollarsAmount));
                    break;
                case 3:
                    displayMessage("The exchange rate is " + controller.getExchangeRate());
                    break;
                case 4:
                    displayMessage("Goodbye!");
                    continueRunning = false;
                    break;
                default:
                    displayMessage("Invalid choice. Please try again");
            }
        }
    }
}
