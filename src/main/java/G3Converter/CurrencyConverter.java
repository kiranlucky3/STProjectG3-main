package G3Converter;

import static G3Converter.Unit.CURRENCY_ASSOCIATION_LIST;
import static G3Converter.Unit.CURRENCY_MATRIX;

public class CurrencyConverter {

    private final String fromCurrency;
    private final String toCurrency;

    public CurrencyConverter(String fromCurrency, String toCurrency) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public double convert(Double value) {
        int i = CURRENCY_ASSOCIATION_LIST.get(this.fromCurrency);
        int j = CURRENCY_ASSOCIATION_LIST.get(this.toCurrency);
        return value * CURRENCY_MATRIX[i][j];
    }
}
