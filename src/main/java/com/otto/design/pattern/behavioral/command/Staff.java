package com.otto.design.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * program: design_pattern
 * description: Staff
 * *@author: gqchu
 * create: 2021-07-25 21:41
 **/
public class Staff {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
