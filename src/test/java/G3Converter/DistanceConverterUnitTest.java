package G3Converter;

import org.junit.Assert;
import org.junit.Test;

public class DistanceConverterUnitTest {

    @Test
    public void testMetersToKilometers() {
        DistanceConverter dc = new DistanceConverter(Unit.METERS, Unit.KILOMETERS);
        Assert.assertEquals(0.001, dc.convert(1.0), 0);
    }

    @Test
    public void testMetersToMiles() {
        DistanceConverter dc = new DistanceConverter(Unit.KILOMETERS, Unit.MILES);
        Assert.assertEquals(3.106855, dc.convert(5.0), 0);
    }

    @Test
    public void testMilesToMeters() {
        DistanceConverter dc = new DistanceConverter(Unit.MILES, Unit.METERS);
        Assert.assertEquals(4828.032, dc.convert(3.0), 0);
    }

    @Test
    public void testMilesToFeet() {
        DistanceConverter dc = new DistanceConverter(Unit.MILES, Unit.FEET);
        Assert.assertEquals(10560.0, dc.convert(2.0), 0);
    }

    @Test
    public void testCentimetersToInches() {
        DistanceConverter dc = new DistanceConverter(Unit.CENTIMETERS, Unit.INCHES);
        Assert.assertEquals(5.905515, dc.convert(15.0), 0);
    }

    @Test
    public void testInchesToCentimeters() {
        DistanceConverter dc = new DistanceConverter(Unit.INCHES, Unit.CENTIMETERS);
        Assert.assertEquals(39.878, dc.convert(15.7), 0);
    }
}

