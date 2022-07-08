package exceptions;

public class FiveElementsLimitException extends Exception {

    @Override
    public String getMessage() {
        return "Превышение лимита в 5 элементов";
    }
}
