package homework11.exceptions;

public class GetFromEmptyInputStorageException extends Exception {

    @Override
    public String getMessage() {
        return "Память пуста";
    }
}
