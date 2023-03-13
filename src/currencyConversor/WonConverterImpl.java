package currencyConversor;

public class WonConverterImpl implements Converter {

    private static final String CURRENCY_NAME = "wons surcoreanos";
    private final Double equivalence = 6.5;

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
