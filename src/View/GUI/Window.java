package View.GUI;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Controller.CurrencyController;

public class Window {
    private JFrame frame;
    private JLabel addCurrencyL;
    private JLabel amountOfDollarsLabel;
    private JLabel results;
    private JTextField txtField;
    private JTextField txtField2;
    private JButton setCurrencyButton;
    private JButton convertCurrency;
    private JTextArea txtArea;
    private CurrencyController controller;
    
    public Window(CurrencyController controller) {
        this.controller = controller;
        startWindow();
    }

    private void startWindow() {
        frame = new JFrame("Currency app.");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setting panel.
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        addCurrencyL = new JLabel("Enter the current currency");
        addCurrencyL.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(addCurrencyL);
        // adding text field and set its preferred size.
        txtField = new JTextField(10);
        txtField.setMaximumSize(new Dimension(Short.MAX_VALUE, txtField.getPreferredSize().height)); // Allow only vertical resizing
        txtField.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(txtField);
        // adding buttons.
        setCurrencyButton = new JButton("Enter");
        setCurrencyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setCurrencyBtn();
                JOptionPane.showMessageDialog(null, "The value has been set succesfuly");
            }
        });
        mainPanel.add(setCurrencyButton);
        amountOfDollarsLabel = new JLabel("Amount of dollars to be converted");
        amountOfDollarsLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        //adding another label.
        mainPanel.add(amountOfDollarsLabel);
        // setting another text field.
        txtField2 = new JTextField(10);
        txtField2.setMaximumSize(new Dimension(Short.MAX_VALUE, txtField2.getPreferredSize().height)); // Allow only vertical resizing
        txtField2.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(txtField2);
        // adding buttons.
        convertCurrency = new JButton("Enter");
        convertCurrency.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                getConversionBtn();
            }
            
        });
        convertCurrency.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(convertCurrency);
        // Adding a text area.
        txtArea = new JTextArea(5, 20);
        // another label.
        results = new JLabel("Results");
        results.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        txtArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(results);
        mainPanel.add(txtArea);
        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public  void setCurrencyBtn() {
        String text = txtField.getText();
        controller.setExchangeRate(Integer.parseInt(text));
    }

    public void getConversionBtn() {
        String amount = txtField2.getText();
        String text = Float.toString(controller.convertCurrency(Integer.parseInt(amount)));
        txtArea.setText(text);
    }
}
