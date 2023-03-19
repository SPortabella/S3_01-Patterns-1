import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean exit = false;
        String option;

        Undo undo = Undo.getInstance();

        while (!exit) {

            System.out.println("1. Option 1. Add commands");
            System.out.println("2. Option 2. Delete commands");
            System.out.println("3. Option 3. List commands");
            System.out.println("4. Exit");

            try {
                System.out.println("Choose an option");
                option = sn.nextLine();

                switch (option) {
                    case "1":
                        optionAddCommand(undo);
                        break;
                    case "2":
                        optionDeleteCommand(sn, undo);
                        break;
                    case "3":
                        optionListCommands(undo);
                        break;

                    case "4":
                        exit = true;
                        break;
                    default:
                        System.out.println("Enter only numbers from 1 to 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter numbers only");
            }

        }

    }

    private static void optionListCommands(Undo undo) {
        System.out.println("Option 3. List commands");
        undo.listCommands();
    }

    private static void optionDeleteCommand(Scanner sn, Undo undo) {
        System.out.println("Option 2. Delete commands");
        undo.listCommands();
        if (!undo.getCommands().isEmpty()) {
            System.out.println("Choose element to delete");
            int element = Integer.valueOf(sn.nextLine());
            if ((element-1) < undo.getCommands().size())
                undo.deleteCommand(element - 1);
            else
                System.out.println("Element does1" +
                        "n't exists");

        } else System.out.println("There is no elements to delete");
    }

    private static void optionAddCommand(Undo undo) {
        System.out.println("Option 1. Add commands");
        undo.addCommand(askUserForCommand());
    }

    private static String askUserForCommand() {
        System.out.println("Insert Command:");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
