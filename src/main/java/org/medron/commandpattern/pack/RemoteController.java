package org.medron.commandpattern.pack;

public class RemoteController {
    Command command;

    public RemoteController() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void buttonWasPressed(){
        command.execute();
    }
}
