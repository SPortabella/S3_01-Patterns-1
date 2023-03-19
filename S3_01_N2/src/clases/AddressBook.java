package clases;

public class AddressBook {
    private String name;
    private String address;

    public AddressBook(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "AddressBook\n" +
            "name: " + name + " address: " + address;
    }
}

