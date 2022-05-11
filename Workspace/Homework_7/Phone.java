package Homework_7;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
public class Phone {
    private String model;
    private int weight;
    private int number;


    public Phone(String model, int number) {
        this.model = model;
        this.number = number;
    }

    public Phone() {

    }

    public Phone(String model, int weight, int number) {
        this(model, number);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.printf("\nЗвонит %s", name);
    }

    public void receiveCall(String name, int number) {
        System.out.printf("\nЗвонит %s, номер - %d", name, number);
    }

    public void sendMessage(int ... numbers) {
        System.out.println("\nСообщение было отправлено на следующие номера -> " + Arrays.toString(numbers));
    }
}
