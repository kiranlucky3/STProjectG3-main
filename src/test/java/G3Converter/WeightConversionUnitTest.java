package G3Converter;

import org.junit.Assert;
import org.junit.Test;

public class WeightConversionUnitTest {

    @Test
    public void testGramToKilogram() {
        WeightConverter wc = new WeightConverter(Unit.GRAMS, Unit.KILOGRAMS);
        Assert.assertEquals(0.001, wc.convert(1.0), 0);
    }

    @Test
    public void testGramToMilligram() {
        WeightConverter wc = new WeightConverter(Unit.GRAMS, Unit.MILLIGRAMS);
        Assert.assertEquals(3000, wc.convert(3.0), 0);
    }

    @Test
    public void testKilogramToTonne() {
        WeightConverter wc = new WeightConverter(Unit.KILOGRAMS, Unit.TONNES);
        Assert.assertEquals(0.000006, wc.convert(0.6),  0);
    }

    @Test
    public void testKilogramToGram() {
        WeightConverter wc = new WeightConverter(Unit.KILOGRAMS, Unit.GRAMS);
        Assert.assertEquals(21, wc.convert(2.1), 0);
    }

}

