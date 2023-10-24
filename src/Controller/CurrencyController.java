package Controller;

import Model.CurrencyModel;
import View.CurrencyView;

public class CurrencyController {
    private CurrencyModel model;
    private CurrencyView view;

    public CurrencyController(CurrencyModel model, CurrencyView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setExchangeRate(float rate) {
        model.setPrize(rate);
        view.displayMessage("Exchange rate set to " + rate);
    }

    public float convertCurrency(int dollarsAmount) {
        return model.calculateCurrency(dollarsAmount);
    }

    public float getExchangeRate() {
        return model.getArgPeso();
    }

    public void run() {
        boolean continueRunning = true;
        while(continueRunning) {
            view.displayMenu();
            int userInput = view.getUserInput();
            switch(userInput) {
                case 1:
                    view.displayMessage("Enter the new exchange rate: ");
                    float rate = view.getUserInput();
                    setExchangeRate(rate);
                    break;
                case 2:
                    view.displayMessage("Enter the amount in dollars: ");
                    int dollarsAmount = view.getUserInput();
                    view.displayMessage(dollarsAmount + " USD is equivalent to " + convertCurrency(dollarsAmount));
                    break;
                case 3:
                    view.displayMessage("The exchange rate is " + getExchangeRate());
                    break;
                case 4:
                    view.displayMessage("Goodbye!");
                    continueRunning = false;
                    break;
                default:
                    view.displayMessage("Invalid choice. Please try again");
            }
        }
    }




}
