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
}
