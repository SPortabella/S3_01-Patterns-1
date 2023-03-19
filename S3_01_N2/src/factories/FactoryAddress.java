package factories;

import clases.FranceAddress;
import clases.SpainAddress;
import interfaces.iAddress;

import javax.swing.*;

public class FactoryAddress {

    public FactoryAddress() {

    }

    public iAddress createAddress(Integer numCountry, String name, String address) {

        switch (numCountry) {
            case 1:         // 1 - Spain
               iAddress iAddressE = new SpainAddress(name, address);
                JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Address de España  ");
                return iAddressE;
            case 2:         // 2 - France
                iAddress iAddressF = new FranceAddress(name, address);
                JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Address de Francia  ");
                return iAddressF;
        }
    return null;
    }
}
