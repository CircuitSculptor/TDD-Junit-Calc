public class Calculator {
    public int add(int firstNum, int secondNum)
    {
        long result = (long) firstNum + secondNum;
        if (result > Integer.MAX_VALUE)
        {
            throw new IllegalArgumentException("Input is too large");
        }
        return (int) result;
    }

    public int divide(int firstNum, int secondNum)
    {
        if (secondNum == 0)
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return firstNum / secondNum;
    }

    public int subtract(int firstNum, int secondNum)
    {
        long result = (long) firstNum - secondNum;
        if (result < Integer.MIN_VALUE)
        {
            throw new IllegalArgumentException("Input is too small");
        }
        if (result < 0)
        {
            throw new IllegalStateException("Negative results not allowed");
        }
        return (int) result;
    }

    public int multiply(int firstNum, int secondNum) {
        if (firstNum == 0 || secondNum == 0)
        {
            throw new UnsupportedOperationException("Multiplication by Zero is not allowed");
        }
        long result = (long) firstNum * secondNum;
        if (result > Integer.MAX_VALUE)
        {
            throw new UnsupportedOperationException("Multiplication Overflow");
        }
        return (int) result;
    }
}
