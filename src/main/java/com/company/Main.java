package com.company;

public class Main {

    public static void main(String[] args) {
        Migration migration=new Migration();
        Container container=new Container();
        container.addMigratable(new Item("portable samsung"));
        container.addMigratable(new Item("pc portable"));
        container.addMigratable(new Item("pc portable 2"));
        Container c1=new Container();
        c1.addMigratable(new Item("headset"));
        c1.addMigratable(new Item("headset 2"));
        migration.addMigratable(c1);
        migration.addMigratable(container);
        System.out.println(migration.toString());
        //System.out.println("test item is in container with id: "+migration.getItemContainerId("pc portable 2"));
    }
}
