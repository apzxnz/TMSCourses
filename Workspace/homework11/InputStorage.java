import exceptions.FiveElementsLimitException;
import exceptions.GetFromEmptyInputStorageException;

public class InputStorage {
    private String[] enteredStrings = new String[0];

    public void saveEnteredString(String data) throws FiveElementsLimitException {
        if (this.enteredStrings.length + 1 > 5) {
            throw new FiveElementsLimitException();
        }
        String[] tempArrayStrings = new String[this.enteredStrings.length+1];
        for (int i = 0; i < this.enteredStrings.length; i++) {
            tempArrayStrings[i] = this.enteredStrings[i];
        }
        tempArrayStrings[this.enteredStrings.length] = data;
        this.enteredStrings = tempArrayStrings;
    }

    public String getEnteredString() throws GetFromEmptyInputStorageException {
        if (this.enteredStrings.length == 0) {
            throw new GetFromEmptyInputStorageException();
        }
        String takenString = this.enteredStrings[0];
        String[] tempArrayStrings = new String[this.enteredStrings.length-1];
        for (int i = 1; i < this.enteredStrings.length; i++) {
            tempArrayStrings[i-1] = this.enteredStrings[i];
        }
        this.enteredStrings = tempArrayStrings;

        return takenString;
    }

    public String[] getEnteredStrings() {
        return enteredStrings;
    }
}
