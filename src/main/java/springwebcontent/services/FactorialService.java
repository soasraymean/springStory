package springwebcontent.services;

public class FactorialService {
    public Object calculate(Long firstNumber, Long secondNumber) {
        return getFactorial(firstNumber) + getFactorial(secondNumber);
    }

    private Long getFactorial(Long f) {
        long result = 1L;
        for (long i = 1L; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
