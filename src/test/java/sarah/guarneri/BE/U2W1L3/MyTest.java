package sarah.guarneri.BE.U2W1L3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTest {

    @Test
    public void testSum(){
        int result = ClassForTest.sum(2, 2);
        assertEquals(4, result);
        assertNotEquals(7, result);
    }

    @Test
    public void testSumFor(){
        int result = ClassForTest.sum(new int[]{1, 1, 1});
        assertEquals(3, result);
    }

    @Test
    public void multiplyTest(){
        int result = ClassForTest.multiply(1, 1, 1);
        assertEquals(1, result);
    }

    @Test
    public void moreTests(){
        int result1 = ClassForTest.numbers(2, 2, "add");
        int result2 = ClassForTest.numbers(1, 3, "multiply");
        int result3 = ClassForTest.numbers(6, 3, "divide");

        assertAll(
                () -> assertEquals(4, result1),
                () -> assertEquals(3, result2),
                () -> assertEquals(2, result3)
        );
    }
}
