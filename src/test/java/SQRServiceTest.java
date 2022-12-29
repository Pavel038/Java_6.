import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.javaqimvn.services.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "11,100,400",
    })
    public void shouldCalcExact(int expected, int lowerValue, int upperValue) {
        SQRService service = new SQRService();
        int actual = service.calcSqrt(lowerValue, upperValue);
        Assertions.assertEquals(expected, actual);

    }
}
