package InterfaceLesson.converter;

public class CelsiusToFarenConverter implements IConverter{

    @Override
    public double convert(int tempCelsius) {
        return (tempCelsius + 9/5) + 32;
    }

    @Override
    public char getCode() {
        return 'F';
    }
}
