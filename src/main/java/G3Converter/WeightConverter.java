package G3Converter;

import static G3Converter.Unit.WEIGHT_ASSOCIATION_LIST;
import static G3Converter.Unit.WEIGHT_MATRIX;

public class WeightConverter {

    private final String fromUnit;
    private final String toUnit;

    public WeightConverter(String fromUnit, String toUnit) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    public double convert(Double value) {
        int i = WEIGHT_ASSOCIATION_LIST.get(this.fromUnit);
        int j = WEIGHT_ASSOCIATION_LIST.get(this.toUnit);
        return value * WEIGHT_MATRIX[i][j];
    }
}
