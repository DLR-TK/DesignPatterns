package com.tk.command;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Content content = new Content();

        Command insertCommand = new InsertCommand(content);
        Command copyCommand = new CopyCommand(content);
        Command deleteCommand = new DeleteCommand(content);

        List<Command> commands = new ArrayList<>();
        commands.add(insertCommand);
        commands.add(copyCommand);
        commands.add(deleteCommand);

        for (Command command : commands) {
            command.doit();
        }
        System.out.println(content);

        for (int i = commands.size() - 1; i >= 0 ; i--) {
            commands.get(i).undo();
        }

        System.out.println(content);
    }
}
