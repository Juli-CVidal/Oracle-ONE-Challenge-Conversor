package currencyConversor;

public class EuroConverterImpl implements Converter {

    private static final String CURRENCY_NAME = "euros";
    private final Double equivalence = 0.0046;

    @Override
    public Double convertTo(Double amount) {
        return  amount * equivalence;
    }

    @Override
    public Double convertFrom(Double amount) {
        return amount / equivalence;
    }

    @Override
    public String getCurrencyName(){
        return CURRENCY_NAME;
    }
}
