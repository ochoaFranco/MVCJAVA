package View;

import java.util.Scanner;

public class CurrencyView {
    private Scanner sc;
    
    public CurrencyView() {
        this.sc = new Scanner(System.in);
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









}
