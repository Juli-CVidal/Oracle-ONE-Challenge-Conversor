package frame;

import currencyConversor.Converter;
import currencyConversor.CurrencyConverterContext;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Panel extends JFrame {
    private final HashMap<String, Converter> converters;
    private final CurrencyConverterContext converterContext;
    private JTextField amountField;
    private JComboBox<String> currenciesOptions;

    private JComboBox<String> convertDirection; //Convert to - Convert from

    private JLabel resultLabel;

    public Panel(HashMap<String,Converter> converters, CurrencyConverterContext converterContext) {
        this.converters = converters;
        this.converterContext = converterContext;

        this.amountField = new JTextField(10);
        this.currenciesOptions = new JComboBox<>(new String[]{"Dólares","Euros","Libras","Yenes","Wons"});
        this.convertDirection = new JComboBox<>(new String[]{"Convertir a", "Convertir de"});
        this.resultLabel = new JLabel();
        initFields();

        addCurrenciesListener();
        addDirectionListener();
    }

    private void initFields(){
        setTitle("Conversor challenge - Julián Vidal");
        setSize(450, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        add(panel);

        panel.add(new JLabel("Ingrese el monto: "));
        panel.add(this.amountField);
        panel.add(this.currenciesOptions);
        panel.add(this.convertDirection);
        panel.add(this.resultLabel);
        setVisible(true);
    }


    private void addCurrenciesListener() {
        this.currenciesOptions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String option = (String) currenciesOptions.getSelectedItem();
                converterContext.setConverter(converters.get(option));
            }
        });
    }

    private void addDirectionListener(){
        this.convertDirection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currenciesOptions.getSelectedIndex() == -1){
                    JOptionPane.showMessageDialog(Panel.this,"Debe seleccionar una moneda");
                    return;
                }
                try{
                    Double amount =  Double.parseDouble(amountField.getText());
                    String result = getResult(amount, (String) convertDirection.getSelectedItem());
                    resultLabel.setText(result);
                } catch(NumberFormatException nfe){
                    JOptionPane.showMessageDialog(Panel.this,"Debe introducir un número");
                }


            }
        });
    }

    private String getResult(Double amount, String direction){
        if (amount <= 0){
            return "No ha ingresado un monto válido";
        }
        return direction.equals("Convertir a") ? converterContext.convertTo(amount) : converterContext.convertFrom(amount);
    }
}
