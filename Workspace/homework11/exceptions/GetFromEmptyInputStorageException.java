package exceptions;

public class GetFromEmptyInputStorageException extends Exception {

    @Override
    public String getMessage() {
        return "Память пуста";
    }
}
