package Model;

public class CurrencyModel {
    private float argPeso = 1150;
    
    public void setPrize(float argPeso) {
        this.argPeso = argPeso;
    }
    
    public float calculateCurrency(int dollarsAmount) {
        return dollarsAmount * argPeso;
    }   
    
    public float getArgPeso() {
        return argPeso;
    }
}
