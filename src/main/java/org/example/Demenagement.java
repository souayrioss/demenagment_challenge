package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Demenagement {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int Id_Demenagement;
    private String name;
    private List<Carton> cartons;

    public Demenagement() {
        Id_Demenagement = count.incrementAndGet();
        this.cartons = new ArrayList<Carton>();
    }

    public Demenagement( String name, List<Carton> cartons) {
        Id_Demenagement = count.incrementAndGet();;
        this.name = name;
        this.cartons = new ArrayList<Carton>();
    }

    public int getId_Demenagement() {
        return Id_Demenagement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Carton> getCartons() {
        return cartons;
    }

    public void setCartons(List<Carton> cartons) {
        this.cartons = cartons;
    }

    @Override
    public String toString() {
        return "Demenagement{" +
                "Id_Demenagement=" + Id_Demenagement +
                ", name='" + name + '\'' +
                ", cartons=" + cartons +
                '}';
    }
    public void addCartonGlobale(Carton carton){
        this.cartons.add(carton);
    }
}
