package org.medron.mediatorpattern.pack;

public interface Colleague {
    void send(String message);
    void receive(String message);
}
