package com.company;

public abstract class Migratable {
    protected int id = 0;
    protected String name = "";
    protected static int instancesCount=0;
     protected void generateUniqueId(){
         this.id=instancesCount++;
     };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
