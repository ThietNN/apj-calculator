public class Calculator {

    public static int calculate(int firstOperand, int secondOperand, char Operator) {
        final char Addition = '+';
        final char Subtraction = '-';
        final char Multiplication = '*';
        final char Division = '/';
        switch (Operator) {
            case Addition:
                return firstOperand + secondOperand;
            case Subtraction:
                return firstOperand - secondOperand;
            case Multiplication:
                return firstOperand * secondOperand;
            case Division:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
