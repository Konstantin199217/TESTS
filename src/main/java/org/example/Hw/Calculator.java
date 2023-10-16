package org.example.Hw;

public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    // Нужно написать в калькуляторе метод вычисления суммы покупки со скидкой и проверить его, используя AssertJ
    // Примерная сигнатура и тело метода:
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount == 0 || discountAmount == 0) {
            throw new ArithmeticException("Недопустимые аргументы");
        }
        double x = purchaseAmount;// purchaseAmount - сумма покупки
        int y = discountAmount;// discountAmount - размер скидки
        double result = x - (x * y / 100);
        return result; // Метод должен возвращать сумму покупки со скидкой
    }
}