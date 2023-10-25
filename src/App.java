import javax.swing.SwingUtilities;

import Controller.CurrencyController;
import Model.CurrencyModel;
import View.CurrencyView;
//import View.GUI.CurrencyConverterApp;
import View.GUI.Window;

public class App {
    public static void main(String[] args) {
        CurrencyModel model = new CurrencyModel();
        CurrencyController controller = new CurrencyController(model);
        CurrencyView view = new CurrencyView(controller);
        //view.run();
        SwingUtilities.invokeLater(()-> {
            new Window(controller);
        });
    }
}
