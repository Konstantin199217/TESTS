
import org.example.Calculator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testDiscount() {
        double purchaseAmount = 100;
        int discountAmount = 15;
        double result = purchaseAmount -(purchaseAmount * discountAmount / 100);

        assertThat(Calculator.calculatingDiscount(purchaseAmount,discountAmount)).isEqualTo(85);

        assertThatThrownBy (() -> Calculator.calculatingDiscount(100, 0)
        ).isInstanceOf(ArithmeticException.class);
    }


}