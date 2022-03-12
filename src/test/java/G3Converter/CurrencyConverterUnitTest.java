package G3Converter;

import org.junit.Assert;
import org.junit.Test;

public class CurrencyConverterUnitTest {

    @Test
    public void testDollarToEuro() {
        CurrencyConverter dc = new CurrencyConverter(Unit.DOLLARS, Unit.EURO);
        Assert.assertEquals(0.905, dc.convert(1.0), 0);
    }

    @Test
    public void testEuroToYen() {
        CurrencyConverter dc = new CurrencyConverter(Unit.EURO, Unit.JPYEN);
        Assert.assertEquals(128.03, dc.convert(1.0), 0);
    }

    @Test
    public void testYenToCrowns() {
        CurrencyConverter dc = new CurrencyConverter(Unit.JPYEN, Unit.SWCROWNS);
        Assert.assertEquals(0.083, dc.convert(1.0), 0);
    }

    @Test
    public void testDollarToYen() {
        CurrencyConverter dc = new CurrencyConverter(Unit.DOLLARS, Unit.JPYEN);
        Assert.assertEquals(115.74, dc.convert(1.0), 0);
    }

    @Test
    public void testCrownsToEuro() {
        CurrencyConverter dc = new CurrencyConverter(Unit.SWCROWNS, Unit.EURO);
        Assert.assertEquals(0.093, dc.convert(1.0), 0);
    }
}
