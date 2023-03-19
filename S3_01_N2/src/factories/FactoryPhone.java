package factories;

import clases.FrancePhone;
import clases.SpainPhone;
import interfaces.iPhone;

import javax.swing.*;

public class FactoryPhone {

    public FactoryPhone() {

    }

    public iPhone createPhone(Integer numCountry, String name, String phoneNumber) {
        iPhone iPhone = null;

        switch (numCountry) {
            case 1:         // 1 - Spain
                iPhone = new SpainPhone(name, phoneNumber);
                JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Phone de España  ");
                return iPhone;
            case 2:         // 2 - France
                iPhone = new FrancePhone(name, phoneNumber);
                JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Phone de Francia  ");
                return iPhone;
        }

        return iPhone;
    }
}
