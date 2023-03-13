package currencyConversor;

public class YenConverterImpl implements Converter {

    private static final String CURRENCY_NAME = "yenes japoneses";
    private final Double equivalence = 0.66;

    @Override
    public Double convertTo(Double amount) {
        return amount * equivalence;
    }

    @Override
    public Double convertFrom(Double amount) {
        return amount / equivalence;
    }

    @Override
    public String getCurrencyName() {
        return CURRENCY_NAME;
    }
}
