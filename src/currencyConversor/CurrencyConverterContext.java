package currencyConversor;

import constants.Constants;

public class CurrencyConverterContext {
    private Converter converter;

    public void setConverter(Converter converter) {
        this.converter = converter;
    }

    public String convertFrom(Double amount) {
        return Constants.CONVERT_FROM(amount, converter.convertFrom(amount), converter.getCurrencyName());
    }

    public String convertTo(Double amount) {
        return Constants.CONVERT_TO(amount, converter.convertTo(amount), converter.getCurrencyName());
    }
}
