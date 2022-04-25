package InterfaceLesson.converter;

public class CelsiusToKelvinСonverter implements IConverter {

    @Override
    public double convert(int tempCelsius) {
        return tempCelsius + 273.15;
    }

    @Override
    public char getCode() {
        return 'K';
    }
}
