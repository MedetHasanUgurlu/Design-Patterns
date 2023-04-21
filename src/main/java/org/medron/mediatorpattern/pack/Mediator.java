package org.medron.mediatorpattern.pack;

public interface Mediator {
    void send(String message, Colleague colleague);
}
