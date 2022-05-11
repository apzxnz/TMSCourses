package Homework_7;

public class PhoneTask {
    public static void main(String[] args) {
        Phone samsung = new Phone("Samsung", 100, 192211);
        Phone iphone = new Phone("Iphone", 75, 1112225);
        Phone nokia = new Phone("Nokia", 999, 101);

        Phone[] phones = {samsung, iphone, nokia};

        for (Phone phone : phones) {
            System.out.printf("\nМодель телефона - %s", phone.getModel());
            System.out.printf("\nНомер телефона - %d", phone.getNumber());
            phone.receiveCall("Petya");
            phone.receiveCall("Alesya", 102);
            phone.sendMessage(102,103,12414,5550);
        }


    }
}
