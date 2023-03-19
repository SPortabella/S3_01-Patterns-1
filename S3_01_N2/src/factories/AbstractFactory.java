package factories;

import interfaces.iAbstractFactory;
import interfaces.iAddress;
import interfaces.iPhone;


public class AbstractFactory implements iAbstractFactory {

    public AbstractFactory() {
    }

    @Override
    public iPhone createPhone(Integer numCountry, String name, String phoneNumber) {
        FactoryPhone factoryPhone = new FactoryPhone();
        iPhone iPhone = factoryPhone.createPhone(numCountry, name, phoneNumber);
        return iPhone;
    }

    @Override
    public iAddress createAddress(Integer numCountry, String name, String address) {
        FactoryAddress factoryAddress = new FactoryAddress();
        iAddress iAddress = factoryAddress.createAddress(numCountry, name, address);
        return iAddress;
    }
}

