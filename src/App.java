import Controller.CurrencyController;
import Model.CurrencyModel;
import View.CurrencyView;

public class App {
    public static void main(String[] args) {
        CurrencyModel model = new CurrencyModel();
        CurrencyView view = new CurrencyView();
        CurrencyController controller = new CurrencyController(model, view);
        controller.run();
    }
}
