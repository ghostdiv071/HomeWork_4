package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    public int reverse(int inputNumber) {
        int result = 0;
        while (inputNumber != 0) {
            if (result > Integer.MAX_VALUE / 10 || Integer.MAX_VALUE - Math.abs(inputNumber) % 10  < result * 10) {
                throw new NumberOutOfRangeException();
            }
            result = result * 10 + inputNumber % 10;
            inputNumber /= 10;
        }
        return result;
    }
}
