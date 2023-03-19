package interfaces;

public interface iAbstractFactory {

    iPhone createPhone(Integer country, String name, String phoneNumber);

    iAddress createAddress(Integer country, String name, String address);

}
