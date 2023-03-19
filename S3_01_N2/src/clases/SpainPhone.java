package clases;

import interfaces.iPhone;

public class SpainPhone extends PhoneBook implements iPhone {

    public SpainPhone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = "00" + "34" + phoneNumber;
    }

    @Override
    public void showPhone(String name, String number) {
        System.out.println("numero de teléfono: " + name + "-" + number);
    }

}
