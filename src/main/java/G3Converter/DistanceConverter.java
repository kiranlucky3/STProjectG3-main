package G3Converter;

import static G3Converter.Unit.DISTANCE_ASSOCIATION_LIST;
import static G3Converter.Unit.DISTANCE_MATRIX;

public class DistanceConverter {

    private final String fromUnit;
    private final String toUnit;

    public DistanceConverter(String fromUnit, String toUnit) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    public double convert(Double value) {
        int i = DISTANCE_ASSOCIATION_LIST.get(this.fromUnit);
        int j = DISTANCE_ASSOCIATION_LIST.get(this.toUnit);
        return value * DISTANCE_MATRIX[i][j];
    }
}
