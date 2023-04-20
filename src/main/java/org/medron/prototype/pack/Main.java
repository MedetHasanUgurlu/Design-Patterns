package org.medron.prototype.pack;

public class Main {
    public static void main(String[] args) {
        User user = new User(1,"Medo");
        User user2 =(User) user.clone();
        System.out.println(user2.getId()+" "+ user2.getName());
    }
}
