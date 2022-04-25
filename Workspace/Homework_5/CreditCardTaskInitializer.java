package Homework_5;

public class CreditCardTaskInitializer {
    public static void main(String[] args) {
        CreditCard alfaBankCreditCard = new CreditCard("#1ABC", 0);
        CreditCard vtbBankCreditCard = new CreditCard("#2VTBA", 0);
        CreditCard belBankCreditCard = new CreditCard("#3BELKJ", 50.0);

        alfaBankCreditCard.putMoneyIntoCardAccount(100.56);
        vtbBankCreditCard.putMoneyIntoCardAccount(54);
        belBankCreditCard.withdrawMoneyFromTheCard(21.29);

        System.out.println(alfaBankCreditCard);
        System.out.println(vtbBankCreditCard);
        System.out.println(belBankCreditCard);
    }
}
