package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Container extends Migratable {
    private List<Migratable> migratableList;
    public Container() {
        migratableList=new ArrayList<>();
        generateUniqueId();
        name="container-"+id;
    }

    public boolean containsObject(String itemName){
        boolean containsItemWithName=migratableList.stream().filter(m->m instanceof Item && m.getName().equals(itemName)).findFirst().isPresent();
        boolean containsContainerThatContainsItemWithName=migratableList.stream().filter(m->m instanceof Container && ((Container)m).containsObject(itemName)).findFirst().isPresent();
        return containsItemWithName || containsContainerThatContainsItemWithName;
    }
    public void addMigratable(Migratable migratable){
        this.migratableList.add(migratable);
    }

    @Override
    public String toString() {
        return "\n"+name+"{\n    "+migratableList.stream().map(i->i.toString()).collect(Collectors.joining(","))+"\n}";
    }
}
