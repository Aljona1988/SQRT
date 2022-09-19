import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void testLongFrame() {

        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calcSqrt(200, 300);
        //System.out.println("1. " + expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testShortFrame() {
        SQRService service = new SQRService();
        int expected = 1;
        int actual = service.calcSqrt(90, 100);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testZeroFrame() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSqrt(90, 90);
        Assertions.assertEquals(expected, actual);


    }
}
