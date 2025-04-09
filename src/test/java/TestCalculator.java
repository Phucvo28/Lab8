import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.example.Calculator;

public class TestCalculator {
    Calculator calculator;

    @BeforeTest
    public void init() {
        calculator = new Calculator();
    }

    @BeforeMethod
    public void reset() {
        calculator.reset();
    }

    @Test
    public void testPlusCorrectly() {
        calculator.plus(28);
        Assert.assertEquals(28, calculator.getResult());
    }

    @Test
    public void testMinusCorrectly() {
        calculator.plus(28);
        calculator.minus(5);
        Assert.assertEquals(23, calculator.getResult());
    }

    @Test
    public void testMulCorrectly() {
        calculator.plus(28);
        calculator.mul(0);
        Assert.assertEquals(0, calculator.getResult());
    }

    @Test
    public void testDivCorrectly() {
        calculator.plus(28);
        calculator.div(0);
        Assert.assertEquals(3, calculator.getResult());
    }
}

