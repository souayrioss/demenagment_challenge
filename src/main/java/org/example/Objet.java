package org.example;

import java.util.concurrent.atomic.AtomicInteger;

public class Objet {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id_Objet;
    private String name;

    public Objet() {
        this.id_Objet = count.incrementAndGet();
    }

    public Objet(String name) {
        this.id_Objet = count.incrementAndGet();
        this.name = name;
    }

    public int getId_Objet() {
        return id_Objet;
    }

    public void setId_Objet(int id_Objet) {
        this.id_Objet = id_Objet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Objet{" +
                "id_Objet=" + id_Objet +
                ", name='" + name + '\'' +
                '}';
    }
}
