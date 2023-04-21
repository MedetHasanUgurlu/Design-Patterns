package org.medron.mediatorpattern.pack2;

public class Main {
    public static void main(String[] args) {

        CMediator mediator = new CMediator();
        Employee employee = new Employee(1,"Medet",mediator);
        Employee employee2 = new Employee(2,"Hasan",mediator);
        Employee employee3 = new Employee(3,"Metehan",mediator);

        mediator.addUser(employee);
        mediator.addUser(employee2);
        mediator.addUser(employee3);
        employee.sendMessage("Hi guys");



    }
}
