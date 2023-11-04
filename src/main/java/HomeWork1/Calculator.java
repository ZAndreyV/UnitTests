package HomeWork1;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Calculator {
    public static double calculateDiscount(double purchaseAmount, int discountPercentage) {
        if (purchaseAmount <= 0 || discountPercentage < 0 || discountPercentage > 100) {
            throw new ArithmeticException("Invalid arguments");
        }

        double discountAmount = purchaseAmount * discountPercentage / 100;
        return purchaseAmount - discountAmount;
    }

    @Test
    public void testCalculateDiscountValidArguments() {
        double result = Calculator.calculateDiscount(1000, 20);
        Assertions.assertThat(result).isEqualTo(800);
    }

    @Test
    public void testCalculateDiscountZeroPurchaseAmount() {
        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(0, 20))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }

    @Test
    public void testCalculateDiscountNegativeDiscountPercentage() {
        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(1000, -20))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }

    @Test
    public void testCalculateDiscountExceeds100DiscountPercentage() {
        Assertions.assertThatThrownBy(() -> Calculator.calculateDiscount(1000, 120))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid arguments");
    }
}


