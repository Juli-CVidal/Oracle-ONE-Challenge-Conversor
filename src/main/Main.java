package main;

import currencyConversor.*;
import frame.Panel;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Converter> converters = new HashMap<>(){{
            put("Dólares", new DollarConverterImpl());
            put("Euros", new EuroConverterImpl());
            put("Libras", new PoundConverterImpl());
            put("Yenes", new YenConverterImpl());
            put("Wons", new WonConverterImpl());
        }};

        new Panel(converters, new CurrencyConverterContext());
    }
}
