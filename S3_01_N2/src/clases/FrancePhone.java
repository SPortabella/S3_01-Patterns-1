package clases;

import interfaces.iPhone;

public class FrancePhone extends PhoneBook implements iPhone {

    public FrancePhone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = "00" + "33" + phoneNumber;
    }

    @Override
    public void showPhone(String name, String number) {
        System.out.println("numero de teléfono: " + name + "-" + number);
    }
}
