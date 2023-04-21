package org.medron.mediatorpattern.pack;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        TurkcellColleague colleague = new TurkcellColleague("Medet",mediator);
        TurkcellColleague colleague2 = new TurkcellColleague("Kemal",mediator);

        mediator.addColleague(colleague);
        mediator.addColleague(colleague2);
        colleague.send("Hello There");
    }
}
