package family;

public class FamilyLastNameNotUniqueException extends Exception{
    @Override
    public String getMessage() {
        return "Фамилия семьи должна быть уникальной";
    }
}
