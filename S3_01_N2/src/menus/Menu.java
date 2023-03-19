package menus;

import javax.swing.*;

public class Menu {
    public static Integer showMainMenu() {
        String cad = "";
        cad += "Enter option: \n";
        cad += "1. Phone Book \n";
        cad += "2. Address Book\n";
        cad += "3. Exit\n\n";
        Integer option = Integer.parseInt(JOptionPane.showInputDialog(cad));

        return option;
    }

}
