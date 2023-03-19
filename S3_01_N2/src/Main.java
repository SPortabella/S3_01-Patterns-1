import clases.AddressBook;
import factories.AbstractFactory;

import interfaces.iAddress;
import interfaces.iPhone;
import menus.Menu;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static String selectType = "";
    static List<iPhone> phoneBooks = new ArrayList<>();
    static List<iAddress> addressBooks = new ArrayList<>();

    public static void main(String[] args) {

        Boolean exit = false;

        try {
            do {
                try {
                    int option = Menu.showMainMenu();
                    System.out.println(option);
                    switch (option) {
                        case 1:
                            selectType = "PHONE";
                            insertPhone();
                            break;
                        case 2:
                            selectType = "ADDRESS";
                            insertAddress();
                            break;
                        case 3:
                            selectType = "";
                            exit = true;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Incorrect option");
                            break;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Incorrect option");
                }
            } while (!exit);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Bye!!!");
        }
    }

    private static void insertAddress() {
        Integer numCountry = enterCountry();
        String name = enterName();
        String address = enterAddress();

        AbstractFactory abstractFactory = new AbstractFactory();
        iAddress iAddress = abstractFactory.createAddress(numCountry, name, address);

        addressBooks.add(iAddress);
        addressBooks.forEach(add -> System.out.println(add));

    }

    private static String enterAddress() {return JOptionPane.showInputDialog("Enter address:\n");
    }

    private static void insertPhone() {
        Integer numCountry = enterCountry();
        String name = enterName();
        String phoneNumber = enterNumber();

        AbstractFactory abstractFactory = new AbstractFactory();
        iPhone iPhone = abstractFactory.createPhone(numCountry, name, phoneNumber);

        phoneBooks.add(iPhone);
        phoneBooks.forEach(phone -> System.out.println(phone));
    }

    private static String enterNumber() {
        Boolean ok = false;
        Integer number = 0;
        do {
            try {
                number = Integer.parseInt(JOptionPane.showInputDialog("Enter number:\n"));
                ok = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Incorrect number");
            }

        } while (!ok);

        return String.valueOf(number);
    }

    private static String enterName() {
        return JOptionPane.showInputDialog("Enter name:\n");
    }

    private static Integer enterCountry() {
        Boolean ok = false;
        Integer numCountry = 0;
        do {
            try {
                numCountry = Integer.parseInt(JOptionPane.showInputDialog("Enter country:\n 1-Spain \n 2-France \n"));
                if (numCountry == 1 || numCountry == 2) ok = true;
                else JOptionPane.showMessageDialog(null, "Incorrect option");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Incorrect option");
            }

        } while (!ok);

        return numCountry;
    }

}