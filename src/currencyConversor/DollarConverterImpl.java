package currencyConversor;

public class DollarConverterImpl implements Converter {

    private static final String CURRENCY_NAME = "dólares";
    private final Double equivalence = 0.0050;

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
