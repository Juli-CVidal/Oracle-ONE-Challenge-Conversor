package currencyConversor;

public interface Converter {
    
    public String getCurrencyName();

    public Double convertTo(Double amount);

    public Double convertFrom(Double amount);
}
