package Controller;
import Model.CurrencyModel;

public class CurrencyController {
    private CurrencyModel model;

    public CurrencyController(CurrencyModel model) {
        this.model = model;
    }
    
    public void setExchangeRate(float rate) {
        model.setPrize(rate);
    }

    public float convertCurrency(int dollarsAmount) {
        return model.calculateCurrency(dollarsAmount);
    }

    public float getExchangeRate() {
        return model.getArgPeso();
    }
}
