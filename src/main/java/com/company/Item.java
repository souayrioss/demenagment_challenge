package com.company;

public class Item extends Migratable {

    public Item(String name) {
        generateUniqueId();
        setName(name);
    }

    @Override
    public String toString() {
        return ""+this.name;
    }
}
