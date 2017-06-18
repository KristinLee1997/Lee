package JavaSE.DesignPatterns.CommandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/6/15.
 */
public class Waiter {
    //    private Command command;
    private List<Command> commands = new ArrayList<Command>();

//    public Command getCommand() {
//        return command;
//    }
//
//    public void setCommand(Command command) {
//        this.command = command;
//    }

    public void setOrder(Command command) {
        commands.add(command);
    }

    public void removeOrder(Command command) {
        commands.remove(command);
    }

    public void sall() {
        for (Command command : commands) {
            command.sall();
        }
    }
}
