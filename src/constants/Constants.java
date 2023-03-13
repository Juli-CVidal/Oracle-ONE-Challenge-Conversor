package constants;

public class Constants {
    public static final String CONVERT_TO(Double amount, Double equivalence, String currencyName){
        return amount + " pesos equivale a " + equivalence + " " + currencyName;
    }

    public static final String CONVERT_FROM(Double amount, Double equivalence, String currencyName){
        return amount + " " + currencyName + " equivale a " + equivalence + " pesos";
    }
}
