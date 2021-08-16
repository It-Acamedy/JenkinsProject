import static org.junit.Assert.assertEquals;

public class SumNumbersTest {

    @org.junit.Test
    public void sumTestToBePassed() {
        SumNumbers sumNumbers = new SumNumbers();
        int actualResult = sumNumbers.sum(5);
        assertEquals(15, actualResult);
    }

    @org.junit.Test
    public void sumTestToBeFailed() {
        SumNumbers sumNumbers = new SumNumbers();
        int actualResult = sumNumbers.sum(5);
        assertEquals(5, actualResult);
    }
}