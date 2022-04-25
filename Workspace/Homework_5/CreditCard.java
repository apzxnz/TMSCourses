package Homework_5;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreditCard {

    public CreditCard(String cardAccountNumber, double cardAccountAmount) {
        this.cardAccountNumber = cardAccountNumber;
        this.cardAccountAmount = cardAccountAmount;
    }

    protected String cardAccountNumber;
    protected double cardAccountAmount;

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardAccountNumber='" + cardAccountNumber + '\'' +
                ", cardAccountAmount=" + cardAccountAmount +
                '}';
    }

    public void withdrawMoneyFromTheCard(double money) {
        this.cardAccountAmount -= money;
    }

    public void putMoneyIntoCardAccount(double money) {
        this.cardAccountAmount += money;
    }
}
