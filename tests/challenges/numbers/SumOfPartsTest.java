package challenges.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfPartsTest {

    SumOfParts sum = new SumOfParts();

    @Test
    void getSum() {
        int[] numbers = sum.createNumbers();
        assertEquals(-1994305056, sum.getSum(numbers)[0] );
        assertEquals(26, sum.getSum(numbers)[1] );
        assertEquals(21, sum.getSum(numbers)[2] );
        assertEquals(15, sum.getSum(numbers)[3] );
        assertEquals(8, sum.getSum(numbers)[4] );
        assertEquals(0, sum.getSum(numbers)[5] );
    }
}