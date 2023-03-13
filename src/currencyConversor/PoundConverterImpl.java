package currencyConversor;

public class PoundConverterImpl implements Converter {

    private static final String CURRENCY_NAME = "libras esterlinas";
    private final Double equivalence = 0.0041;

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
