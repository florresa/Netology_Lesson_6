import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class TestSQRService {
    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "5,200,400",
            "12,100,500",
            "0,1,10",
            "0,10,99"
    })

    public void testSQRService(int expected, int numFrom, int numTo) {
        SQRService SQRService = new SQRService();
        int actual = SQRService.calcSqrt(numFrom, numTo);
        assertEquals(expected, actual);
    }
}
