package org.medron.commandpattern.pack;

public class Main {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(new LightOnCommand(new Light("Blue",75)));
        remoteController.buttonWasPressed();
    }
}
