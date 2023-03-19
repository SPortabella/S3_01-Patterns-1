package clases;

public class PhoneBook {
     String name;
     String phoneNumber;

     @Override
     public String toString() {
          return "PhoneBook\n" +
                  "name='" + name + " - " + phoneNumber;
     }
}
