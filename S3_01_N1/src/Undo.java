import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Undo {

    public static Undo undo = null;

    private List commands;

    private Undo() {
    }

    public static Undo getInstance() {
        if(undo ==null){
            undo = new Undo();
        }
        return undo;
    }

    public List getCommands() {
        if (commands == null) {
            commands = new ArrayList<Command>();
        }
        return commands;
    }

    public List addCommand (String command){
        if (commands == null) {
            commands = new ArrayList<Command>();
        }
        commands.add(new Command(command));
        return commands;

    }
    public List deleteCommand (int position){
        commands.remove(position);
        return commands;
    }

    public void listCommands (){
        if (commands == null) {
            commands = new ArrayList<Command>();
        }
        AtomicInteger index = new AtomicInteger();
        commands.stream().map(str -> index.getAndIncrement()+1 + " -> " + str).forEach(System.out::println);

    }
}
